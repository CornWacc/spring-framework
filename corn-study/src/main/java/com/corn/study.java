package com.corn;

import com.corn.app.AppConfig;
import com.corn.bean.TestService;
import com.corn.bean.TestService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class study {

	public static void main(String[] args) {

		//初始化Spring上下文(容器)
		//Bean存储位置 -- Map -- 单例池
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfig.class);

		//这里传入的参数是根据BeanDefinition里面的参数来的
		context.getBean(TestService2.class);

//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClass(TestService.class);
//		beanDefinition.setScope("singleton");

	}
}
