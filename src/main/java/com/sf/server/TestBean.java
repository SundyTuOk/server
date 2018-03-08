package com.sf.server;

import java.util.Properties;

import org.springframework.stereotype.Service;

@Service("TestBean")
public class TestBean {
	public void print(){
		System.out.println("hahah");
		System.out.println(System.getProperty("user.dir"));
	}
}
