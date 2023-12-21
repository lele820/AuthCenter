package com.wll.authcenter.controller.login;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "测试Swagger3", description = "测试Swagger3注解")
@RestController
public class LoginController {
    @Operation(summary = "测试Swagger3注解方法Get")
    @Parameters({@Parameter(name = "id",description = "编码"),
            @Parameter(name = "headerValue",description = "header传送内容")})
    @RequestMapping("/hello")
    public String hello() {
        log.info("测试类开始执行");
        return "";
    }
}
