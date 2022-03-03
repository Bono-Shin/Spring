package aopTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	/*
	 * 1.Aspect : ���ɻ� - ���� ���ɻ翡 ���� ���� ����� ��� �ִ� Ŭ������ �ǹ� (���� LogAop Ŭ����)
	 * 2.Target : Aspect�� �����ؾ� �� Ŭ���� �Ǵ� �޼ҵ�
	 * 3.Advice : Aspect�� ��� ���� ��� �ϳ��ϳ��� �ǹ��� (���������� � ���� �ؾ��ϴ����� ���� �ΰ������ ���� ����ü)
	 * 4.joinpoint : ���� ����� ����Ǿ�� �ϴ� ���� (���� ������ ���� ��, �� �Ǵ� ���� ��)
	 * 5.pointCut :  joinpoint�� ���� ������ �ǹ� (joinpoint ���� ��� �Ǵ� ��ġ)
	 */
	
	//������
							//���� ����� ����Ǵ� ����
	public Object loggerAop(ProceedingJoinPoint joingpoint) throws Throwable {
		
		//�ٽɷ��� ���� ���� �Ŀ� ȣ�� �� ���� ���
		//ProceeddingJoinPoint �� �ٽ� ������ ������ ��� �ִ� ��ü
		
		String signatureStr = joingpoint.getSignature().toShortString();
		System.out.println(signatureStr + "����");
		System.out.println("�ٽ� ��� ���� ������ ���� ����Դϴ�.");
		
		try {
			//�ٽɷ��� ����
			Object obj = joingpoint.proceed();
			return obj;
		}finally {
			//�ٽ� ���� ���� �� ���� �� ���� ����
			System.out.println("�ٽ� ��� ���� �� ���� �� ���� ����Դϴ�.");
			System.out.println(signatureStr + "��");
		}
	}

							//���� joinpoint�� �ٸ� ����
	public void loggerAop2(JoinPoint joinpoint) {
		System.out.println("�ٽ� ���� ���� ���� ȣ�� �� ���� ����Դϴ�.");
		System.out.println(joinpoint.getSignature().toShortString()+"����");
	}
	
	public void loggerAop3(JoinPoint joinpoint) {
		System.out.println("�ٽ� ���� ���� �Ŀ� ȣ�� �� ���� ����Դϴ�.");
		System.out.println(joinpoint.getSignature().toShortString()+"��");
	}
}
