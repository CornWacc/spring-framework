package com.corn.spring.bean;


import com.corn.spring.annotation.Point;
import com.corn.spring.interfaces.SayInterface;
import org.springframework.stereotype.Service;

@Service("userBean")
public class UserBean implements SayInterface{

	@Point
	public void say(String s){
		System.out.println(s);
	}
}
