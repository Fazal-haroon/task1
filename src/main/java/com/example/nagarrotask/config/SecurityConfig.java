package com.example.nagarrotask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * This function is used to configure the AuthenticationManagerBuilder object
     *
     * @param auth AuthenticationManagerBuilder
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("admin")
                .and()
                .withUser("user")
                .password("user")
                .roles("user");
    }

    /**
     * It configures the security for the application.
     *
     * @param http This is the root of the HttpSecurity configuration.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/account/**").hasRole("admin")
                .antMatchers("/date/**").hasRole("admin")
                .antMatchers("/amount/**").hasRole("admin")
                .antMatchers("/all").hasAnyRole("user","admin")
                .and()
                .formLogin();
    }

    /**
     * This function returns a PasswordEncoder object that does not encode passwords.
     *
     * @return A PasswordEncoder object.
     */
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


}
