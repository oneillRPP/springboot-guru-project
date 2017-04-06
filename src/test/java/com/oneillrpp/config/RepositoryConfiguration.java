package com.oneillrpp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
    @Author: oneillRPP
*/

//This class wires beans to allow us to test our database and JPA implementation.

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.oneillrpp.entities"})
@EnableJpaRepositories(basePackages = {"com.oneillrpp.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {



}
