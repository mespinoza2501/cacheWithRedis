package com.api.shorten.cache.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
	public Docket cacheApi() {
		return  new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.api.shorten.cache"))
					.paths(springfox.documentation.builders.PathSelectors.regex("/cache.*"))
					.build()
					.apiInfo(new ApiInfo("API cache","Api reponsavel de cache de requisiçõe em DB noSQL", "1.0", null, new Contact("Espinoza", null, null),null , null));
	}
	
	
	
}
