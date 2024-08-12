package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalone/TestStandalone.xml");
	Person per = (Person) context.getBean("per1");
	System.out.println(per);
	}

}
