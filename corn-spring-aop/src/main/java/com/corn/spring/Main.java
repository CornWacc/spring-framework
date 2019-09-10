package com.corn.spring;

import com.corn.spring.app.AppConfig;
import com.corn.spring.bean.UserBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		UserBean userBean = context.getBean(UserBean.class);

	}
}
