package ch06.circle;

public class Circle {
	//main이 없는 클래스는 라이브러리 클래스라고 함. (인스턴스용- 객체를 생성하는 용도)
	//필드(맴버 변수로 객체가 가지고 있을 값)
	public int radius;
	public String name;
	
	
	//생성자(Circle circle은 new Circle(); -> 기본 생성자 (생략 가능)
	
	public Circle() {//객체 생성시 매개값 없이 생성
		
	}// 기본 생성자 (클래스와 이름이 같은 매서드)
	
	public Circle(int radius) {// 생성자 오버로딩
		this.radius = radius; // this -> 내가 가진 필드에 넣어라
	}//사용자 지정 생성자 (커스텀 생성자) -> Circle circle = new Circle(10);
	
	public Circle(int radius, String name) {// 생성자 오버로딩
		this.radius= radius;
		this.name = name;
	}//사용자 지정 생성자 (커스텀 생성자) -> Circle circle = new Circle(10, "지구");
	
	
	//매서드 (동작에 해당)
	public double getArea() {
		
		
		
		return 3.14 * radius * radius;
		//getArea() 매서드 호출시 매서드 값을 계산하여 출력
	}
	
	
	
	
}
