package diTest3;

import org.springframework.stereotype.Component;

/*
	@Component �̳����̼��� Ŭ���� ���� �����Ǿ� �ִ� �ʵ� �ʱⰪ ��� ��üȭ �� �� ���
	�����ڰ� ��ü���� ������ �ʵ尪�� ������ �� ����.
	���� �� ��� ���� ���� ���̴� ����̴� (�ַ� ��Ʈ�ѷ�)
	�ַ� Ŭ���� �ϳ��� ��ü �ϳ��� �ʿ��� �� ����ϴ� ���
*/
@Component
public class Bean1 {

	private String field1 = "bean �ʵ�1";
	private String field2 = "bean �ʵ�2";
	
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
