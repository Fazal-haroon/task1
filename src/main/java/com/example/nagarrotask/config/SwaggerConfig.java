package com.example.nagarrotask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * It creates a Docket bean which is used by the swagger2 feature to generate the swagger documentation.
     *
     * @return Docket
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(new ApiInfoBuilder()
                        .title("Swagger Super")
                        .description("Swagger Description details")
                        .version("1.0").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.nagarrotask.controller"))
                .paths(PathSelectors.any()).build();
    }
}
