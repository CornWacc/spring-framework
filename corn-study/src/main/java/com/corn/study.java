package com.corn;

import com.corn.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class study {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfig.class);


	}
}
