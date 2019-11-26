package com.corn.spring.bean;

import com.corn.spring.annotation.Point;
import org.springframework.stereotype.Service;

@Service("cityBean")
public class CityBean{

	public void doo(){
		System.out.println(1);
	}
}
