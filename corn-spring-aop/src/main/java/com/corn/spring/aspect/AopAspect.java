package com.corn.spring.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspect {

	@Pointcut("execution(* com.corn.spring.bean.*.*(..))")
	public void cat(){}

	@Before("cat()")
	public void test1(JoinPoint point){
		System.out.println("aop拦截到了");
	}
}
