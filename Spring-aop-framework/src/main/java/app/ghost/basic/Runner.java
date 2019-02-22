package app.ghost.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app/ghost/basic/spring.xml");
		System.out.println("container instantiated");
		Apple apple = context.getBean("apple" , Apple.class);
		apple.setName("pubjabi apple");
		apple.getName();
	}
}
