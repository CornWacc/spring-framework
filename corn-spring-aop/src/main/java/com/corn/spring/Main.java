package com.corn.spring;

import com.corn.spring.app.AppConfig;
import com.corn.spring.bean.UserBean;
import com.corn.spring.bean.ZooBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserBean bean = context.getBean(UserBean.class);
		ZooBean bean1 = context.getBean(ZooBean.class);

		bean.say();
		bean1.say();
	}
}
