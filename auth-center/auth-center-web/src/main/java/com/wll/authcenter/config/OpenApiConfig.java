package com.wll.authcenter.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot-3.2.0不支持swagger3，所以要使用OpenApi
 */
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("测试 title")
                        .description("SpringBoot3 集成 Swagger3")
                        .version("v1"));
    }
}
