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
package org.sonar.javascript.model.interfaces.expression;

import org.sonar.javascript.model.interfaces.Tree;
import org.sonar.javascript.model.interfaces.lexical.SyntaxToken;

/**
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.4">Binary Operator</a>
 * <p/>
 *
 * <a herf="http://www.ecma-international.org/ecma-262/5.1/#sec-11.6>Additive Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.7">Bitwise Shift Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.8">Relational Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.9">Equality Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.10">Binary Bitwise Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.11">Binary Logical Operators</a>.
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-11.13">Assignment Operators</a>.
 * <p/>
 *
 * <pre>
 *   {@link #leftOperand()} {@link Tree.Kind#MULTIPLY *} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#DIVIDE /} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#REMAINDER %} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#PLUS +} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#MINUS -} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#LEFT_SHIFT <<} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#RIGHT_SHIFT >>} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#UNSIGNED_RIGHT_SHIFT >>>} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#LESS_THAN <} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#GREATER_THAN >} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#LESS_THAN_OR_EQUAL_TO <=} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#GREATER_THAN_OR_EQUAL_TO >=} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#EQUAL_TO ==} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#STRICT_EQUAL_TO ===} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#NOT_EQUAL_TO !=} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#STRICT_NOT_EQUAL_TO !==} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#BITWISE_AND &} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#BITWISE_XOR ^} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#BITWISE_OR |} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#CONDITIONAL_AND &&} {@link #rightOperand()}
 *   {@link #leftOperand()} {@link Tree.Kind#CONDITIONAL_OR ||} {@link #rightOperand()}
 * </pre>
 * <p/>
 *
 * <p>This interface is not intended to be implemented by clients.</p>
 */
public interface BinaryExpressionTree extends ExpressionTree {

  ExpressionTree leftOperand();

  SyntaxToken operator();

  ExpressionTree rightOperand();

}
