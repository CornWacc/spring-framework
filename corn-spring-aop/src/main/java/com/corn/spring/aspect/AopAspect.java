package com.corn.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AopAspect {

	@Pointcut("execution(* com.corn.spring.bean..*.*(..))")
	public void point(){}

	@After("point()")
	public void test1(){

	}
}
