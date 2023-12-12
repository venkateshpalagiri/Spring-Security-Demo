package com.venkatesh.spring.security.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug=true)
public class SecurtiyAppConfig {
	
	
	@Bean
	public InMemoryUserDetailsManager setUpUsers() {
		UserDetails user1=User
				.withUsername("venky")
				.password("$2a$12$6i4cpVYbdrUOvRx5f7ZOxOLUuHEXVveAWsvbFPhs2.hcp9utKynYG")
				.roles("admin","user")
				.build();
		UserDetails user2=User
				.withUsername("abc")
				.password("abc")
				.roles("admin","user")
				.build();
		
//		InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
//		inMemoryUserDetailsManager.createUser(user1);
//		inMemoryUserDetailsManager.createUser(user2);

		return new InMemoryUserDetailsManager(user1,user2);
		
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	
	
	
	
	
	
	
	
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
