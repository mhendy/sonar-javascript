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

import org.sonar.check.BelongsToProfile;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.javascript.api.EcmaScriptPunctuator;
import org.sonar.squidbridge.annotations.Tags;
import org.sonar.squidbridge.checks.SquidCheck;
import org.sonar.sslr.parser.LexerlessGrammar;

import com.sonar.sslr.api.AstNode;

@Rule(
  key = "BitwiseOperators",
  priority = Priority.BLOCKER,
  tags = {Tags.PITFALL})
@BelongsToProfile(title = CheckList.SONAR_WAY_PROFILE, priority = Priority.MAJOR)
public class BitwiseOperatorsCheck extends SquidCheck<LexerlessGrammar> {

  @Override
  public void init() {
    subscribeTo(
        EcmaScriptPunctuator.AND,
        EcmaScriptPunctuator.OR,
        EcmaScriptPunctuator.XOR,
        EcmaScriptPunctuator.TILDA,
        EcmaScriptPunctuator.SL,
        EcmaScriptPunctuator.SR,
        EcmaScriptPunctuator.SR2,
        EcmaScriptPunctuator.AND_EQU,
        EcmaScriptPunctuator.OR_EQU,
        EcmaScriptPunctuator.XOR_EQU,
        EcmaScriptPunctuator.SL_EQU,
        EcmaScriptPunctuator.SR_EQU,
        EcmaScriptPunctuator.SR_EQU2);
  }

  @Override
  public void visitNode(AstNode astNode) {
    getContext().createLineViolation(this, "Remove the use of \"{0}\" operator.", astNode, astNode.getTokenValue());
  }

}
