package com.restservice.config;

import com.restservice.services.ContactServiceImpl;
import com.restservice.services.ContactService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.restservice")
@EnableWebMvc
public class AppConfig {

    @Bean(name = "contactService")
    public ContactService getContactService(){
        return new ContactServiceImpl();
    }

}