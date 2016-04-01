/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.member.Method;

public class ASTMethod extends AbstractApexNode<Method> {

    public ASTMethod(Method method) {
    	super(method);
    }

    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
    }

    @Override
    public String getImage() {
        return node.getMethodInfo().getIdentifier().value;
    }
}
