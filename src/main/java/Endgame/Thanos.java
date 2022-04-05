package Endgame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Avengers.Iron;

public class Thanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Iron iron=(Iron)context.getBean("I");
		System.out.println(iron.getName());
		iron.fighting();
		iron.flying();
	}

}
