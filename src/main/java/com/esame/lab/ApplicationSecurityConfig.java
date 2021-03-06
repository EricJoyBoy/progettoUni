
package com.esame.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;







/**
 * ApplicationSercurityConfig √® la classe la quale fornira sistema di  autenticazione, 
 * autorizzazione e altre funzionalit√† di sicurezza al progetto
 * @author Eric Marins
 *
 */
@EnableWebSecurity
@Configuration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/login", "/resources/**", "/css/**", "/fonts/**", "/img/**").permitAll()
		.antMatchers("/registracittadino", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/index", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/home", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/cittadini", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/centrivaccinali", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/registracentro", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/registravaccinato", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/informazioni", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/informazioni2", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/h2", "/resources/**", "/css/**", "/fonts/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/users/addNew").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login").permitAll();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public UserDetailsService userDetailsService() {
	    return super.userDetailsService();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDetailsService);
		
		provider.setPasswordEncoder(passwordEncoder());
		
		return provider;
	}


}
