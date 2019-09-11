package com.corn.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.corn.spring")
@EnableAspectJAutoProxy
public class AppConfig {
}
