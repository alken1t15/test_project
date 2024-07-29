package com.example.test4.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Securitry {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       return http .csrf(csrf -> csrf.disable())
               .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.GET,"/").permitAll().anyRequest().authenticated()).build();
    }
}
