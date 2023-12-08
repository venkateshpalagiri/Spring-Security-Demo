package com.venkatesh.spring.security.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug=true)
public class SecurtiyAppConfig {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Bean
//	InMemoryUserDetailsManager setUpUser(){
//	
////	GrantedAuthority role=new SimpleGrantedAuthority("admin");
////	GrantedAuthority role1=new SimpleGrantedAuthority("user");
//	ArrayList<GrantedAuthority> authoritiesList=new ArrayList<GrantedAuthority>();
////	authoritiesList.add(role);
////	authoritiesList.add(role1);
//	
//	authoritiesList.add(new SimpleGrantedAuthority("admin"));
//	authoritiesList.add(new SimpleGrantedAuthority("user"));
//	
//	UserDetails venkyUser=new User("venky","123",authoritiesList);
//	InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
//	inMemoryUserDetailsManager.createUser(venkyUser);
//	return inMemoryUserDetailsManager;
//	
//	}
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}

}
