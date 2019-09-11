package com.corn.spring.bean;

import com.corn.spring.annotation.Point;
import org.springframework.stereotype.Service;

@Service
public class ZooBean {
	@Point
	public void say(String s){
		System.out.println(s);
	}
}
