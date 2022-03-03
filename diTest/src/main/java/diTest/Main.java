package diTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//개발자가 하는 의존 주입
		B b = new B();
		b.setField("b객체의 field");
		
		A a = new A();
		a.setField2(b); //setter 주입
		a.setField1("a객체의 field1");
		
		System.out.println(a.getField1());
		
		//스프링이 의존 주입
		//ioc 컨테이너 사용 의존 자동 주입
		//classpath 키워드가 있으면 resource 폴더 안에서 찾는다
		String path = "classpath:applicationContext.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//id 값으로 호출
		A beanA = ctx.getBean("a",A.class);
		
		System.out.println(beanA.getField1());
		System.out.println(beanA.getField2().getField());
		
		/*
		 	스프링 프레임워크의 ioc 컨테이너를 이용한 setter 주입 실습
		 	
		 	1. 학생과 학교 각 객체 생성 정보를 xml에 추가한다.
		 	2. 이때, 학교의 학생 정보는 xml에 등록 된 객체 생성 정보를 참조한다.
		 	3. main 에서 학교 객체를 ioc 컨테이너에서 가져와 학생 이름과 나이, 학교명을 출력한다.
		 */
		
		path = "classpath:applicationContext.xml";
		
		ctx = new GenericXmlApplicationContext(path);
		
		//설정한 name 값으로 호출
		/*
		School A = ctx.getBean("school",School.class);
		
		System.out.println(A.getName());
		System.out.println(A.getStudent().getName());
		System.out.println(A.getStudent().getAge());
		*/
		
		School A = ctx.getBean("school",School.class);
		System.out.println(A.getStudent().length);
		
		
		//생성자로 주입
		Computer computer = ctx.getBean("computer",Computer.class);
		
		computer.getMainboard().method1();
		computer.getRam().method1();
		
	}
}
