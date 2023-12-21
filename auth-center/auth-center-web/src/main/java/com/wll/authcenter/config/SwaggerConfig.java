package com.wll.authcenter.config;

public class SwaggerConfig {
    /**
     * 用于读取配置文件 application.properties 中 swagger 属性是否开启
     */
    /*@Value("${swagger.enabled}")
    Boolean swaggerEnabled;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        *//*作者信息*//*
        Contact contact = new Contact("村雨遥", "https://cunyu193.github.io", "7aaaaaaa");
        return new ApiInfoBuilder()
                .title("Swagger3接口文档")
                .description("更多请咨询服务开发者XXX")
                .contact(new Contact("作者", "作者地址", "作者邮箱"))
                .version("1.0")
                .termsOfServiceUrl("aaa")
                .build();
    }*/
}
