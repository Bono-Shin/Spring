package diTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//�����ڰ� �ϴ� ���� ����
		B b = new B();
		b.setField("b��ü�� field");
		
		A a = new A();
		a.setField2(b); //setter ����
		a.setField1("a��ü�� field1");
		
		System.out.println(a.getField1());
		
		//�������� ���� ����
		//ioc �����̳� ��� ���� �ڵ� ����
		//classpath Ű���尡 ������ resource ���� �ȿ��� ã�´�
		String path = "classpath:applicationContext.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//id ������ ȣ��
		A beanA = ctx.getBean("a",A.class);
		
		System.out.println(beanA.getField1());
		System.out.println(beanA.getField2().getField());
		
		/*
		 	������ �����ӿ�ũ�� ioc �����̳ʸ� �̿��� setter ���� �ǽ�
		 	
		 	1. �л��� �б� �� ��ü ���� ������ xml�� �߰��Ѵ�.
		 	2. �̶�, �б��� �л� ������ xml�� ��� �� ��ü ���� ������ �����Ѵ�.
		 	3. main ���� �б� ��ü�� ioc �����̳ʿ��� ������ �л� �̸��� ����, �б����� ����Ѵ�.
		 */
		
		path = "classpath:applicationContext.xml";
		
		ctx = new GenericXmlApplicationContext(path);
		
		//������ name ������ ȣ��
		/*
		School A = ctx.getBean("school",School.class);
		
		System.out.println(A.getName());
		System.out.println(A.getStudent().getName());
		System.out.println(A.getStudent().getAge());
		*/
		
		School A = ctx.getBean("school",School.class);
		System.out.println(A.getStudent().length);
		
		
		//�����ڷ� ����
		Computer computer = ctx.getBean("computer",Computer.class);
		
		computer.getMainboard().method1();
		computer.getRam().method1();
		
	}
}
