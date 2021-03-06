package it.unisalento.brokerapp.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		WebMvcConfigurer.super.addCorsMappings(registry);
		registry.addMapping("/**").allowedMethods("PUT", "DELETE", "PATCH","GET","POST","UPDATE");
	}
}
