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
package org.sonar.javascript.model.interfaces.declaration;

import org.sonar.javascript.model.implementations.SeparatedList;
import org.sonar.javascript.model.interfaces.Tree;
import org.sonar.javascript.model.interfaces.lexical.SyntaxToken;

/**
 * Common interface for all types of <a href="https://people.mozilla.org/~jorendorff/es6-draft.html#sec-destructuring-binding-patterns">Object Binding Pattern</a>.
 * <p/>
 *
 * <pre>
 *   { }
 *   { {@link #elements()} }
 *   { {@link #elements()} , }
 * </pre>
 *
 * <p>This interface is not intended to be implemented by clients.</p>
 */
public interface ObjectBindingPatternTree extends DeclarationTree, BindingElementTree {

  SyntaxToken openCurlyBrace();

  SeparatedList<Tree> elements();

  SyntaxToken closeCurlyBrace();

}
