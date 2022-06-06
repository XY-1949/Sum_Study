package com.yinsd.test;

import com.apple.eawt.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/5/20 22:41
 */
@EnableSwagger2
@SpringBootApplication
@MapperScan("com.yinsd.test.mapper")
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);

    }
}
