package com.lxc.springbootemail;

import com.lxc.springbootemail.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEmailApplicationTests {

    @Autowired
    MailService mailService;

    @Test
    void contextLoads() {
        mailService.sendSimpleMail("xianchaolin@126.com","test","first test");
    }

}
