package com.codeinvestigator.mongomysql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;

@Configuration
public class TransactionManagerConfig {
    @Bean("mongotrans")
    public MongoTransactionManager transactionManagerMongo(MongoDbFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }

    @Bean("jpatrans")
    public JpaTransactionManager transactionManagerjpaOther(){
        return new JpaTransactionManager();
    }

    @Bean("transactionManager")
    public JpaTransactionManager transactionManagerjpa(){
        return new JpaTransactionManager();
    }

}
