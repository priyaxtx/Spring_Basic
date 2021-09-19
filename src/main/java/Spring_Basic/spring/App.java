package Spring_Basic.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
    	
    	vehicle obj=(vehicle)context.getBean("bike");
    	obj.drive();
     // Vehicle obj=new Car();
     // obj.drive();
    }
}
