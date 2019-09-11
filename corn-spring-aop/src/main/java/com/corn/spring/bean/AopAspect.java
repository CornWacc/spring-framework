package com.corn.spring.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspect {

	@Pointcut("execution(* com.corn.spring.interfaces.SayInterface+.*(..))")
	public void cat(){}

	@Before("cat()")
	public void test1(){
		System.out.println("aop拦截到了");
	}
}
