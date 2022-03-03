package diTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//ioc 컨테이너가 관리하게 하는 방법 - 어노테이션 이용
//bean 이름 바꾸는법 @Component(value="p")
@Component
public class Parent {

	private Bean1 bean1;

	public Bean1 getBean1() {
		return bean1;
	}

	//이름을 지정하는 어노테이션 (Bean1의 bean1을 넣어라)
	@Qualifier("bean1") //클래스 이름이 들어간다 (별도로 지정하지 않으면 해당 클래스의 소문자로 설정되어 있다.)
	//의존을 주입할 때 타입별로 주입한다.
	@Autowired
	// @Autowired로 주입을 할 때 @Qualifier가 지정한 이름을 가진 메소드에 주입함
	public void setBean1(Bean1 bean1) {
		this.bean1 = bean1;
	}
	
	public void print() {
		bean1.print();
	}
}
