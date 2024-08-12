package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSteoretype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student1 = context.getBean("ob", Student.class);
		Student student2 = context.getBean("ob", Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.getAddress());
		Teacher t1 = (Teacher) context.getBean("teacher");
		Teacher t2 = (Teacher) context.getBean("teacher");
		System.out.println(t1.hashCode());
		System.out.println(t1);
		System.out.println(t2.hashCode());
	}

}
