package com.codeinvestigator.mongomysql.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ChainedTransactionConfig {
    @Bean("chainedTransactionManager")
    public PlatformTransactionManager chainedTransactionManager
            (@Qualifier("mongotrans") MongoTransactionManager mongoTransactionManager,
            @Qualifier("jpatrans") JpaTransactionManager jpaTransactionManager  ){
        ChainedTransactionManager transactionManager = new ChainedTransactionManager(
                jpaTransactionManager, mongoTransactionManager
        );
        return transactionManager;
    }
}
