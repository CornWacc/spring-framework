package com.corn.spring;

import com.corn.spring.app.AppConfig;
import com.corn.spring.bean.CityBean;
import com.corn.spring.bean.UserBean;
import com.corn.spring.interfaces.SayInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserBean bean = (UserBean) context.getBean(SayInterface.class);
//		bean.say("哈哈哈");

		CityBean cityBean = context.getBean(CityBean.class);
		cityBean.doo();
	}
}
