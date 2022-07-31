package com.primerApp.SprintBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class SprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootApplication.class, args);
	}
//   @Bean
//   public WebMvcConfigurer corsConfigurer() {
//      return new WebMvcConfigurerAdapter() {
//         @Override
//         public void addCorsMappings(CorsRegistry registry) {
//            registry.addMapping("/").allowedOrigins("localhost:4200");
//         }
//      };
//   }


}
