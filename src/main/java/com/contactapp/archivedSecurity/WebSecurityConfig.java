package com.contactapp.archivedSecurity;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity.RequestMatcherConfigurer;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
//import org.springframework.security.web.util.matcher.RegexRequestMatcher;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.cors.reactive.CorsConfigurationSource;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.servlet.handler.HandlerMappingIntrospector;
//import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;
//
//import java.util.Arrays;
//
////import org.springframework.security.web.util.matcher.MvcRequestMatcher;
//import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
//import org.springframework.web.servlet.handler.HandlerMappingIntrospector;


//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig {
	
//	@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests()
////                .requestMatchers("/api/**")
//                .requestMatchers(new RegexRequestMatcher("/api/contact/addContact", "POST")).authenticated()
////                .permitAll()
//                .anyRequest().authenticated();
////                .and()
////            .formLogin()
////                .loginPage("/login")
////                .permitAll()
////                .and()
////            .rememberMe();
//
//        return http.build();
//    }
	
	
	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests().anyRequest().permitAll();
//    	http.csrf().disable().authorizeRequests().anyRequest().permitAll();
//
//    }
	
//	@Bean
//    public DefaultSecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(csrf->csrf.disable())
//                .authorizeRequests(auth->auth.requestMatchers("/api/**", "/h2-ui").permitAll())
//                .authorizeRequests(auth->auth.anyRequest().authenticated())
////                .sessionManagement(sess->sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
//                .httpBasic(Customizer.withDefaults())
//                .build();
//		
////			return httpSecurity
////			    .csrf()
////			    .disable()          
////			    .authorizeHttpRequests()
////			    .requestMatchers("/api/**", "/h2-ui").permitAll()
////			    .anyRequest()
////			    .authenticated();
//    }
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Scope("prototype")
//	@Bean
//	MvcRequestMatcher.Builder mvc(HandlerMappingIntrospector introspector) {
//		return new MvcRequestMatcher.Builder(introspector);
//	}
	
//	@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests((authz) -> {
//				try {
//                    authz
//                            .anyRequest().authenticated().and().formLogin();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//            );
////            .httpBasic();
//        return http.build();
//    }
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//	    return httpSecurity
//	        .csrf(csrf -> csrf.disable())
//	        .authorizeHttpRequests(auth -> auth
//	            .requestMatchers("/api/**", "/h2-ui").permitAll()
//	            .anyRequest().authenticated()
//	        )
////	        .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////	        .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
//	        .httpBasic(Customizer.withDefaults())
//	        .build();
//	}
	
//	@Bean
//	public CorsWebFilter corsWebFilter() {
//	    CorsConfiguration corsConfig = new CorsConfiguration();
//	    corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//	    corsConfig.setMaxAge(3600L);
//	    corsConfig.addAllowedMethod("*");
//	    corsConfig.addAllowedHeader("Requestor-Type");
//	    corsConfig.addExposedHeader("X-Get-Header");
//
//	    UrlBasedCorsConfigurationSource source =
//	        new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", corsConfig);
//
//	    return new CorsWebFilter((CorsConfigurationSource) source);
//	}
	
//	@Configuration
//	public class SecurityConfiguration {
		
//		@Bean
//		public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//		return authenticationConfiguration.getAuthenticationManager();
//		}
		
//		@Bean
//	    public WebSecurityCustomizer webSecurityCustomizer() {
//	        return (web) -> web.ignoring().requestMatchers("/ignore1", "/ignore2");
//	    }

//	    @Bean
//	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	        http
//	            .authorizeHttpRequests((authz) -> authz
//	                .anyRequest().authenticated()
//	            )
//	            .httpBasic();
//	        return http.build();
//	    }

//	}
	
	
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests((authz) -> authz.anyRequest().permitAll());
////		return http.build();
////		http.csrf().disable()
//////		.authorizeHttpRequests()
////		.antMatchers(HttpMethod.GET, "/").permitAll()
//////		.requestMatchers("/home/public")
//////		.anyRequest()
//////		.requestMatchers("/**")
////		.permitAll()
////		.anyRequest()
////		.authenticated()
////		.and()
////		.formLogin();
//		
//		http
//	    .authorizeHttpRequests((authorize) -> authorize
//	        .anyRequest().authenticated()
//	    );
//		
//		return http.build();
//	}

//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests((authz) -> authz.anyRequest().permitAll());
////		return http.build();
//		http.csrf().disable()
//		.authorizeHttpRequests()
//		.requestMatchers(mvc.pattern("/"))
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin();
//		
//		return http.build();
//	}
	
//	@Bean
//    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception {
//        return http.csrf(csrf -> csrf.disable())
//           .authorizeHttpRequests(auth -> {
//            auth.anyRequest().authenticated();
////            auth.requestMatchers(antMatcher("/**")).permitAll();
//            auth.anyRequest().authenticated();
//        }).httpBasic().and().build();
//    }
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests((authz) -> authz.anyRequest().permitAll());
////		return http.build();
//		http.csrf().disable()
//		.authorizeHttpRequests()
//		.requestMatchers("/")
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin();
//		
//		return http.build();
//	}
	
//	@Bean
//	SecurityFilterChain appSecurity(HttpSecurity http, MvcRequestMatcher.Builder mvc) throws Exception {
//	    http
//	        .authorizeHttpRequests((authorize) -> authorize
//	            .requestMatchers(antMatcher("/*"))
//	            .anyRequest().authenticated());
//	        // ...
//	    return http.build();
//	}
	
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, MvcRequestMatcher.Builder mvc) throws Exception {
//        http
//            .authorizeRequests(authorize -> authorize
//                .requestMatchers(mvc("/home/*")) // Adjust the URL pattern as needed
//                .permitAll()) // Allow all requests to /home/*
//                .anyRequest().authenticated()
//            )
//            .httpBasic(); // Enable HTTP Basic authentication
//
//        return http.build();
//    }
//}
