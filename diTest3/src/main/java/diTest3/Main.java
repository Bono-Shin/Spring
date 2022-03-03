package diTest3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		
		Bean1 b1 = ctx.getBean("bean1", Bean1.class);
		
		b1.print();
		
							  //이름을 지정 안하면 해당 클래스의 소문자로 설정이 되어 있다.
		Parent p1 = ctx.getBean("parent", Parent.class);
		
		p1.print();
	}
}
