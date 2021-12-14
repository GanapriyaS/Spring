package com.priya.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
//        Car car=new Car();
//        car.drive();
    	
//    	To avoid 2 dependenies on both side let change only one using vehicle interface
//    	Vehicle obj=new Car();
//    	obj.drive();
    	
//    	To avoid both side let vuse bean
//    	used getBean from 2 interfaces BeanFactory or ApplicationContext => belong to spring framework
//    	context = new ClassPathXmlApplicationContext("spring.xml");
    	
//     Configuration in 3 ways : XML, annotations and java configuration
//    	Vehicle obj= (Vehicle)context.getBean("car");
//    	obj.drive();
    	
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
    	
//    	Autowired Annotation
//		context = new ClassPathXmlApplicationContext("spring.xml");
//    	Car obj= (Car)context.getBean("car");
		
//		Bean Configuration 
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		Bike obj= (Bike)context.getBean(Bike.class);
    	obj.drive();
    	
    	
    }
}
