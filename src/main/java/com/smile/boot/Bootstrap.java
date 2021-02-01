package com.smile.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yafei.liu
 * Create at 2021-02-02 00:42
 */
@SpringBootApplication
public class Bootstrap {
    /**
     * Spring Boot 启动入口
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        try {
            SpringApplication.run(Bootstrap.class, args);
        } catch (Throwable e) {
            throw e;
        }
    }
}
