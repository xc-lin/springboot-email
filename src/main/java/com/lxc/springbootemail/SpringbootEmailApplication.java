package com.lxc.springbootemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class SpringbootEmailApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringbootEmailApplication.class, args);
    }
}
