package com.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class MySQLDatabaseTypeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        String enabledDBType = System.getProperty("dbType", "MYSQL");
        return (enabledDBType != null && enabledDBType.equalsIgnoreCase("MYSQL"));
    }

}
