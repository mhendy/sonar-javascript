/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011 SonarSource and Eriks Nukis
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.javascript.checks;

import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifier;
import org.junit.Test;
import org.sonar.javascript.JavaScriptAstScanner;

import java.io.File;

public class AlwaysUseCurlyBracesCheckTest {

  @Test
  public void test() {
    AlwaysUseCurlyBracesCheck check = new AlwaysUseCurlyBracesCheck();

    SourceFile file = JavaScriptAstScanner.scanSingleFile(new File("src/test/resources/checks/alwaysUseCurlyBraces.js"), check);
    CheckMessagesVerifier.verify(file.getCheckMessages())
        .next().atLine(3).withMessage("Missing curly brace.")
        .next().atLine(5)
        .next().atLine(7)
        .next().atLine(9)
        .next().atLine(15)
        .next().atLine(21)
        .noMore();
  }


}
