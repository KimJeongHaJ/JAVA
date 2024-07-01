package ch04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// Up and Down 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다. (01 ~50)
		// 사용자를 숫자를 입력한다.
		// 컴퓨터가 랜덤 숫자를 판단하여 up 또는 down을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤 숫자가 일치하면 프로그램 종료와 함께 당첨사실을 알린다.
		// 3번 안에 성공시 상품 증정용 코드 추가

		int answer = (int) (Math.random() * 50) + 1;
		Scanner input = new Scanner(System.in);// 키보드로 입력받는 객체 생성

		int question = 0;// 사용자가 입력하는 숫자 보관용
		int hit = 0; // 카운트용
		
		System.out.println("========================");
		System.out.println("Up and Down게임에 오신걸 환영합니다..");
		System.out.println("세번 안에 맞추면 상품을 제공합니다.");
		System.out.println("상품 제공은 관리자에게 문의하세요.");
		System.out.println("========================");

		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요.");

			question = input.nextInt();// 사용자가 숫자를 키보드로 입력한다.
			hit++; // 키보드로 입력한 횟수 카운트용

			if (question > answer) {// 사람이 쓴 숫자가 크니 답은 아래쪽에 있다.
				System.out.println("down");
			} else if (question < answer) {// 사람이 쓴 숫자가 작으니 답은 위쪽에 있다.
				System.out.println("up");
			}

		} while (question != answer); // do while문 종료
		// 랜덤 숫자와 사용자가 입력한 숫자가 같지 않으면 do 문으로 올라감
		// 랜덤 숫자와 사용자가 입력한 숫자가 같으면 아래로 내려옴

		System.out.println("정답입니다." + answer);
		System.out.println("고객님이 맞춘 횟수는 : " + hit + "번입니다.");
		if (hit<=3) {
			System.out.println("상품 수령 관리자가 연락을 드립니다.");
			System.out.println("상품을 선택하세요. 1. 모루인형 2. 동전지갑 3. 편의점 쿠폰");
			int prizechoice = input.nextInt();
			switch (prizechoice) {//상품 고르기
			case 1 :
				System.out.println("모루인형");
			case 2 : 
				System.out.println("동전지갑");
			case 3 : 
				System.out.println("편의점 쿠폰");
			
		}//swtich 매서드
		}//if 매서드
		else 
			System.out.println("상품 수령 실패 , 다음번 기회는 없습니다.");
		
		

}//main 매서드
}//class 매서드
