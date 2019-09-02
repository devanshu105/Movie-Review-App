package com.movie.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableJpaRepositories(basePackages = "com.dao")
@EntityScan(basePackages = "com.dao")
@SpringBootApplication
public class MovieReviewAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewAppApplication.class, args);
		
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/movie/signin").allowedOrigins("*");
                registry.addMapping("/movie/signin").allowCredentials(true);
                
                registry.addMapping("/movie/signup").allowedOrigins("*");
                registry.addMapping("/movie/signup").allowCredentials(true);
                
                registry.addMapping("/movie/signout").allowCredentials(true);
                
                registry.addMapping("/movies/viewMovies").allowedOrigins("*");
                registry.addMapping("/movies/viewMovies").allowCredentials(true);
            }
        };
	}

	
}
