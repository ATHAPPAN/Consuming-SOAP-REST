package com.Dog.DogApi.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.RestTemplate;

import com.Dog.DogApi.client.NumberClient;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {


//	 @Bean
//	public SecurityFilterChain filter (HttpSecurity http) throws Exception{
//		http
//		.csrf().disable()
//		.authorizeRequests().anyRequest()
//		.authenticated().and().httpBasic();
//		
//		return http.build();
//		}
//	
	
	//https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
	  @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests((authz) -> authz
	                .anyRequest().authenticated()
	            )
	            .httpBasic();
	        return http.build();
	    }


	@Bean
	    public InMemoryUserDetailsManager userDetailsService() {
	        UserDetails user = User.withDefaultPasswordEncoder()
	            .username("user")
	            .password("password")
	            .roles("USER")
	            .build();
	        return new InMemoryUserDetailsManager(user);
	    }

	@Bean
	public RestTemplate getRestTemp(RestTemplateBuilder builder) {
		return builder.build();
		
	}


    @Bean
    Jaxb2Marshaller marshaller() {
	        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	        // this package must match the package in the <generatePackage> specified in
	        // pom.xml
	       // marshaller.setContextPath("com.dataaccess.webservicesserver.ObjectFactory.class");
	        marshaller.setPackagesToScan("com.dataaccess.webservicesserver");
	        return marshaller;
	    }
    @Bean
     NumberClient countryClient(Jaxb2Marshaller marshaller) {
    	NumberClient client = new NumberClient();
      client.setDefaultUri("https://www.dataaccess.com/webservicesserver");
      client.setMarshaller(marshaller);
      client.setUnmarshaller(marshaller);
      return client;
    }

}
