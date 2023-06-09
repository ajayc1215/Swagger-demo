package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @Bean	
	
	public Docket apis() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("employee-api")
				.apiInfo(apiInfo())
				.select()		
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.paths(PathSelectors.any())
				.build();

    }


     private ApiInfo apiInfo( ) {
	return new ApiInfoBuilder()
			.title("Employee API")
			.description("Spring Rest API reference")
			.licenseUrl("ajay.chikka@gmail.com")
			.version("1.0")
			.build();
    }
}
