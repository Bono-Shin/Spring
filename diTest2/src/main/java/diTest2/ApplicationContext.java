package diTest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml을 대신할 자바 생성 후 어노테이션 선언

@Configuration
public class ApplicationContext {
	
	//메소드 한개가 bean 한개의 역할을 한다
	@Bean
	public B getB() {
		B b = new B();
		b.setField("class를 이용하여 b객체 생성");
		
		return b;
	}
	
	@Bean
	public A getA() {
		A a = new A();
		a.setField1("class를 이용하여 a객체 생성");
		a.setField2(getB()); //setter 주입 발생
		
		return a;
	}
}
