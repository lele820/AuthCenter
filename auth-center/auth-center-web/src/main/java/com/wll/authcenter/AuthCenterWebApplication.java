package com.wll.authcenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AuthCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthCenterWebApplication.class, args);
        log.info("auth-center启动成功，端口:{}","8080");
    }

}
