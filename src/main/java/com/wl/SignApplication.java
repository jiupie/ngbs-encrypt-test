package com.wl;

import com.wl.core.encrypt.annotation.EnableEncrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 南顾北衫
 */
@EnableEncrypt
@SpringBootApplication
public class SignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SignApplication.class, args);
    }
}
