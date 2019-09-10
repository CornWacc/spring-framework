package com.corn.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect
public class NotVeryUseFulAspect {

	@Pointcut("execution(* com.corn.spring.bean..*.*(..))")
	public void point(){}

	@Before("point()")
	public void advice(){
		System.out.println("---------------");
	}
}
