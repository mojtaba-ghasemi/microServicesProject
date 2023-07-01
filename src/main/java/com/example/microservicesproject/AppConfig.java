package com.example.microservicesproject;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.microServiceProject2")
@EntityScan("com.example.microServiceProject2.model")
public class AppConfig {


}
