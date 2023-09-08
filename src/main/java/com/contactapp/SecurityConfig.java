package com.contactapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.contactapp.services.CustomUserDetailsService;

@Configuration
@Profile("!secured")
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = false, securedEnabled = true)
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		// Define your user details service here
		return new CustomUserDetailsService();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

//	 @Override
	 protected void configure(AuthenticationManagerBuilder auth) {
	        auth.authenticationProvider(authenticationProvider());
	   }
//	 
//	 @Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(authz -> {
			try {
				authz.requestMatchers("/login").permitAll().anyRequest().authenticated().and().csrf(csrf -> csrf.disable()).formLogin(
						login -> login.loginPage("/login").defaultSuccessUrl("/api/contact/getAllContacts").permitAll())
						.logout(logout -> logout.permitAll());

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	// Below bean disables all security measures and all entry to all API's without AUTH
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//		http.authorizeHttpRequests(authz -> {
//			try {
//				authz.anyRequest().permitAll().and().csrf(csrf -> csrf.disable());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//		return http.build();
//	}

}

//http
//.authorizeRequests()
//    .antMatchers("/login").permitAll() // Allow anyone to access the login page
//    .anyRequest().authenticated()
//    .and()
//.formLogin()
//    .loginPage("/login")
//    .defaultSuccessURL("/contacts") // Redirect to your contacts page upon successful login
//    .permitAll()
//    .and()
//.logout()
//    .permitAll();

// --------------- older syntax of formlogin and formlogout
//authz
//.requestMatchers("/login").permitAll()
//.anyRequest().authenticated()
//.and()
//.formLogin()
//.loginPage("/login")
//.defaultSuccessUrl("/api/contact/getAllContacts")
//.permitAll()
//.and()
//.logout()
//.permitAll();
