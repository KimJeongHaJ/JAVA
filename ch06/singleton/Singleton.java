package ch06.singleton;

public class Singleton {
	// 싱글톤은 개발자가 강제로 객체 1개만 만들고 싶을 때 사용함 
	//대부분 보안용 코드로 업데이트용 id,pw나 관리자용 계정으로 활용된다.
	// 필드
	private static Singleton st= new Singleton();
	//클래스 외부에서 new 연산자를 호출 할 수 없도록 함.
	
	//생성자
	private Singleton() {
		//생성자를 호출한 만큼 객체가 생성됨.
		//생성자 앞에 private을 붙여서 막음.
	}
	
	
	//매서드 -> 메서드를 통해서만 객체 생성을 한다.
	static Singleton getInstace() {
		return st;
		
	}
	
	
	
}