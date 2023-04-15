package com.qbproject.dinosaurstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.qbproject.dinosaurstore.dao.AccountDAO;
import com.qbproject.dinosaurstore.service.UserDetailsServiceImpl;

@Configuration
public class UserDetailsServiceConfig {

    private final AccountDAO accountDAO;

    public UserDetailsServiceConfig(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl(accountDAO);
    }
}