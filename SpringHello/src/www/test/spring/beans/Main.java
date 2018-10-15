package www.test.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld hw=new HelloWorld();
//		hw.setName2("李显坤吃个屁");
//		hw.hello();
		ApplicationContext txt=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw=(HelloWorld)txt.getBean("helloWorld");
		hw.hello();
		
	}

}
