package com.sf.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constant {
	// spring里面获取bean对象的context
	public static final ApplicationContext APP_CONTEXT = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	
}
