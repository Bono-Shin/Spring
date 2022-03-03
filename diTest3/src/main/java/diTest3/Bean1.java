package diTest3;

import org.springframework.stereotype.Component;

/*
	@Component 이노테이션은 클래스 내에 지정되어 있는 필드 초기값 대로 객체화 할 때 사용
	개발자가 객체마다 별도의 필드값을 지정할 수 없다.
	앞의 두 방법 보다 많이 쓰이는 방법이다 (주로 컨트롤러)
	주로 클래스 하나당 객체 하나가 필요할 때 사용하는 방법
*/
@Component
public class Bean1 {

	private String field1 = "bean 필드1";
	private String field2 = "bean 필드2";
	
	public void print() {
		System.out.println(field1);
		System.out.println(field2);
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}
	
	
}
