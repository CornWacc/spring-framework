package com.corn.spring.bean;


import com.corn.spring.annotation.Point;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserBean {

	@Point
	public void say(){
		System.out.println(1);
	}
}
