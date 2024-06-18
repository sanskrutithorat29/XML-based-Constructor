package com.xmlBasedConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.toString());
		
		Department dept=(Department) context.getBean("dept");
		System.out.println(dept.toString());

	}

}
