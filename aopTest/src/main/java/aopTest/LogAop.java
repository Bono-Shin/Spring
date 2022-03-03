package aopTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	/*
	 * 1.Aspect : 관심사 - 같은 관심사에 대한 공통 모듈을 담고 있는 클래스를 의미 (현재 LogAop 클래스)
	 * 2.Target : Aspect를 적용해야 할 클래스 또는 메소드
	 * 3.Advice : Aspect에 담긴 공통 기능 하나하나를 의미함 (실질적으로 어떤 일을 해야하는지에 대한 부가기능을 담은 구현체)
	 * 4.joinpoint : 공통 모듈이 적용되어야 하는 시점 (실제 로직의 실행 전, 후 또는 전과 후)
	 * 5.pointCut :  joinpoint의 상세한 스펙을 의미 (joinpoint 적용 대상 또는 위치)
	 */
	
	//공통모듈
							//공통 모듈이 적용되는 시점
	public Object loggerAop(ProceedingJoinPoint joingpoint) throws Throwable {
		
		//핵심로직 실행 전과 후에 호출 될 공통 모듈
		//ProceeddingJoinPoint 는 핵심 로직의 정보를 담고 있는 객체
		
		String signatureStr = joingpoint.getSignature().toShortString();
		System.out.println(signatureStr + "시작");
		System.out.println("핵심 기능 전에 실행할 공통 기능입니다.");
		
		try {
			//핵심로직 실행
			Object obj = joingpoint.proceed();
			return obj;
		}finally {
			//핵심 로직 실행 후 실행 될 공통 로직
			System.out.println("핵심 기능 실행 후 실행 될 공통 기능입니다.");
			System.out.println(signatureStr + "끝");
		}
	}

							//위의 joinpoint와 다른 변수
	public void loggerAop2(JoinPoint joinpoint) {
		System.out.println("핵심 로직 실행 전에 호출 될 공통 기능입니다.");
		System.out.println(joinpoint.getSignature().toShortString()+"시작");
	}
	
	public void loggerAop3(JoinPoint joinpoint) {
		System.out.println("핵심 로직 실행 후에 호출 될 공통 기능입니다.");
		System.out.println(joinpoint.getSignature().toShortString()+"끝");
	}
}
