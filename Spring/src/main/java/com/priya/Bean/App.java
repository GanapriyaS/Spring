package com.priya.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.priya.Spring.AppConfig;

public class App {
	private static ApplicationContext con;

	public static void main( String[] args )
    {

		con = new AnnotationConfigApplicationContext(com.priya.Bean.AppConfig.class);
		Samsung obj= (Samsung)con.getBean(Samsung.class);
//		Samsung obj=new Samsung();
    	obj.config();
    	
    	
    }
}
