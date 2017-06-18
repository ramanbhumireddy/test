package org.nsite.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableWebSecurity
//@EnableWebMvc

@Configuration
public class NSiteWebConfiguration extends WebMvcConfigurerAdapter {

	private static Logger log = LoggerFactory.getLogger(WebMvcConfigurerAdapter.class);

	@Autowired
	private HandlerInterceptor loggingInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(loggingInterceptor); //new LoggingInterceptor()).addPathPatterns("/nsite/*");
	    log.debug("LoggingInterceptor Registered.");
	    //registry.addInterceptor(new TransactionInterceptor()).addPathPatterns("/person/save/*");
	} 
	
//	protected void configure(HttpSecurity http) throws Exception {
//		log.info("###URL " + http.authorizeRequests().anyRequest().toString());
//		//http.authorizeRequests()
//		//.antMatchers("/nsite/**").access("hasRole('ROLE_ADMIN')")
//		//.antMatchers("/user/**").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')").and()
//		//.formLogin();
//		//.httpBasic();
//	}
//
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		//auth.inMemoryAuthentication()
//		//.withUser("raman").password("raman").authorities("ROLE_USER").and()
//		//.withUser("admin").password("admin").authorities("ROLE_USER", "ROLE_ADMIN");
//	}
	
	

}
