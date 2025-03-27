package container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AppMain {
public static void main(String[] args) {
	//core container
	//during loading time beanfactory will not create any object
	BeanFactory beanFactory=
			new XmlBeanFactory( new ClassPathResource("resources/spring.xml"));
	
	// when you request first time it create a object
	beanFactory.getBean("c");
	
	// from next time onwords it will not create object
	for(int i=0;i<100;i++)
	{
		beanFactory.getBean("c");
			
	}
	
}
}
