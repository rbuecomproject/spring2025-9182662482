package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain2 {
public static void main(String[] args) {
	//core container
	//during loading time ApplicationContext will  create all objects
	ApplicationContext appContext=new ClassPathXmlApplicationContext("resources/spring.xml");
	
	appContext.getBean("c");
	appContext.getBean("s");
	appContext.getBean("v");
	appContext.getBean("r");
	
	appContext.getBean("c");
	appContext.getBean("s");
	appContext.getBean("v");
	appContext.getBean("r");

	
	
	appContext.getBean("c");
	appContext.getBean("s");
	appContext.getBean("v");
	appContext.getBean("r");

	
	appContext.getBean("c");
	appContext.getBean("s");
	appContext.getBean("v");
	appContext.getBean("r");

}
}
