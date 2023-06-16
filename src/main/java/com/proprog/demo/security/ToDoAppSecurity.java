package com.proprog.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ToDoAppSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                (request) ->
                        request.requestMatchers("/api/todo/create")
                                .permitAll().anyRequest().authenticated()

        ).logout(LogoutConfigurer::permitAll);
        return httpSecurity.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        UserDetails userOne = userBuilder.username("test")
                .password("123456")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userOne);
    }
}
