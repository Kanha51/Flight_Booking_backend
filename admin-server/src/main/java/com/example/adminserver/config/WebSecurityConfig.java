package com.example.adminserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.adminserver.security.filter.JwtAuthEntryPoint;
import com.example.adminserver.security.filter.JwtRequestFilter;

/**
 * The type Web security config.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * The Jwt request filter.
	 */
	private JwtRequestFilter jwtRequestFilter;
	/**
	 * The Jwt user details service.
	 */
	@Autowired
	private UserDetailsService jwtUserDetailsService;
	/**
	 * The Jwt auth entry point.
	 */
	private JwtAuthEntryPoint jwtAuthEntryPoint;

	/**
	 * Sets jwt request filter.
	 *
	 * @param jwtRequestFilter the jwt request filter
	 */
	@Autowired
	public void setJwtRequestFilter(JwtRequestFilter jwtRequestFilter) {
		this.jwtRequestFilter = jwtRequestFilter;
	}

	/**
	 * Sets jwt auth entry point.
	 *
	 * @param jwtAuthEntryPoint the jwt auth entry point
	 */
	@Autowired
	public void setJwtAuthEntryPoint(JwtAuthEntryPoint jwtAuthEntryPoint) {
		this.jwtAuthEntryPoint = jwtAuthEntryPoint;
	}

	/**
	 * Password encoder password encoder.
	 *
	 * @return the password encoder
	 */
	@Autowired
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * Configure global.
	 *
	 * @param auth the auth
	 * @throws Exception the exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	@Bean(BeanIds.AUTHENTICATION_MANAGER)
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/api/v1.0/admin/login", "/api/v1.0/flight/airline/search",
				"/api/v1.0/flight/airline/ticketUpdate", "/docs", "/ui.html", "/h2-console", "/swagger-resources/**",
				"/swagger-ui.html", "/v2/api-docs", "/webjars/**", "/h2-console", "/v2/api-docs", "/webjars/**",
				"/ui/**", "**/search");
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.cors().and().csrf().disable().authorizeRequests().antMatchers("/authenticate").permitAll()
				.anyRequest().authenticated().and().exceptionHandling().authenticationEntryPoint(jwtAuthEntryPoint)
				.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
}
