package com.primerApp.SprintBoot.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedOrigins("http://localhost:4200") //angular Atencion cuando se suba el codigo
        .allowedMethods("GET", "POST", "PUT","DELETE")
        .allowCredentials(true);
  }
}
