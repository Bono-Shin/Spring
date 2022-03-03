package aopTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		
		Target target = ctx.getBean("target", Target.class);
		
		target.method1();
	}
}
