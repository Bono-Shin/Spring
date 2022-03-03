package diTest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		//메소드 이름으로 호출
		A a = ctx.getBean("getA",A.class);
		
		System.out.println(a.getField2().getField());
		
	}
}
