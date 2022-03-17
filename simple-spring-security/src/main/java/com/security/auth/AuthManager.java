package com.security.auth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

@Service
public class AuthManager extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests((requests) -> 
			requests
				.antMatchers("/auth").authenticated());
		http.authorizeRequests((requests) -> 
		requests
			.antMatchers("/accessible").permitAll());
		http.authorizeRequests((requests) -> 
		requests
			.antMatchers("/forbidden").denyAll());
		http.formLogin();
		http.httpBasic();
	}
}
