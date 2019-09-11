package com.corn.spring.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspect {

	@Pointcut("execution(* com.corn.spring.bean.*.*(..))")
	public void cat(){}

	@Before("cat()")
	public void test1(){
		System.out.println("aop拦截到了");
	}
}
