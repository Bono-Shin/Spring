package diTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//ioc �����̳ʰ� �����ϰ� �ϴ� ��� - ������̼� �̿�
//bean �̸� �ٲٴ¹� @Component(value="p")
@Component
public class Parent {

	private Bean1 bean1;

	public Bean1 getBean1() {
		return bean1;
	}

	//�̸��� �����ϴ� ������̼� (Bean1�� bean1�� �־��)
	@Qualifier("bean1") //Ŭ���� �̸��� ���� (������ �������� ������ �ش� Ŭ������ �ҹ��ڷ� �����Ǿ� �ִ�.)
	//������ ������ �� Ÿ�Ժ��� �����Ѵ�.
	@Autowired
	// @Autowired�� ������ �� �� @Qualifier�� ������ �̸��� ���� �޼ҵ忡 ������
	public void setBean1(Bean1 bean1) {
		this.bean1 = bean1;
	}
	
	public void print() {
		bean1.print();
	}
}
