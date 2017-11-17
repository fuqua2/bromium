package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;

/**
 * Converts {@link SyntaxDefinition} to {@link SyntaxDefinitionConfiguration}
 */
public class SyntaxDefinitionASTNodeConverter implements ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> {
    @Override
    public SyntaxDefinitionConfiguration convert(SyntaxDefinition syntaxDefinition) {
        SyntaxDefinitionConfiguration syntaxDefinitionConfiguration = new SyntaxDefinitionConfiguration();
        syntaxDefinitionConfiguration.setContent(syntaxDefinition.getContent());
        syntaxDefinitionConfiguration.setExposedParameter(syntaxDefinition.getParameter().getName());
        return syntaxDefinitionConfiguration;
    }
}
