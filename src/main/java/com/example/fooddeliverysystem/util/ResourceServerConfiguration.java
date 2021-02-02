package com.example.fooddeliverysystem.util;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@RestController
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{


	  @Override
	 public void configure (HttpSecurity http) throws Exception {
	 http
	 .authorizeRequests (). antMatchers ("/oauth/token", "/oauth/authorize**", "/view"). permitAll ();  
	 // .anyRequest (). authenticated (); 
	 http.requestMatchers (). antMatchers ("/users/getallusers") // Deny access to "/ private"
	 .and (). authorizeRequests ()
	 .antMatchers ("/users/getallusers"). access ("hasRole ('USER')") 
	 .and (). requestMatchers (). antMatchers ("/users/adduser") // Deny access to "/ admin"
	 .and (). authorizeRequests ()
	 .antMatchers ("/hello"). access ("hasRole ('ADMIN')");
	 }


}
