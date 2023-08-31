package com.contactapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("!secured")
public class SecurityConfig {
	
	// I will be keeping these commented codes as they shows number of ways of spring security configurations
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest().permitAll()
                .and().csrf().disable();
        return http.build();
    }

	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationConverter jwtAuthenticationConverter) throws Exception {
//	    http.authorizeRequests()
//	            .anyRequest().authenticated()
//	            .and()
//	            .oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthenticationConverter);
//	    return http.build();
//	}
//	@Order(1)	
//    @Bean	
//    public SecurityFilterChain clientFilterChain(HttpSecurity http) throws Exception {	
//        http.authorizeRequests()	
//            .requestMatchers("/")	
//            .permitAll()	
//            .anyRequest()	
//            .authenticated();	
////        http.oauth2Login()	
////            .and()	
////            .logout()	
////            .addLogoutHandler(keycloakLogoutHandler)	
////            .logoutSuccessUrl("/");	
//        return http.build();	
//    }
}
//
//public class SecurityConfig {
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests((authz) -> authz.anyRequest().permitAll());
////		return http.build();
//		http.csrf().disable()
//		.authorizeHttpRequests()
//		.requestMatchers("/api/contact")
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin();
//		
//		return http.build();
//	}
//
//}

//package com.example.demo.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests()
//                .anyRequest().authenticated();
//        http
//                .formLogin();
//
//        return http.build();
//    }
//
//    @SuppressWarnings("deprecation")
//    @Bean
//    public NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
//
//}