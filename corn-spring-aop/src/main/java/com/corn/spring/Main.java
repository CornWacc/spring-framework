package com.corn.spring;

import com.corn.spring.app.AppConfig;
import com.corn.spring.bean.AbCityBeanInterface;
import com.corn.spring.bean.CityBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan("com.corn.spring")
@EnableAspectJAutoProxy
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
//		UserBean bean = (UserBean) context.getBean(SayInterface.class);
//		bean.say("哈哈哈");

//		AbCityBeanInterface cityBean = context.getBean(AbCityBeanInterface.class);
//		cityBean.doo();


		CityBean cityBean = (CityBean) context.getBean("cityBean");
		cityBean.doo();
	}
}
