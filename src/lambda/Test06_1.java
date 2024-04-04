package lambda;

// 람다식을 이용하여 제곱값을 구하시오
//함수적 인터페이스 만들기
@FunctionalInterface
interface MyFunc6 { //추상 클래스 1개
	int calc(int x);
}
//계산하기 위한 구현 클래스 - 생성 //이렇게 하기 싫으면 익명 이너 클래스

public class Test06_1 {
	public static void main(String[] args) {
		MyFunc6 myFunc6 = new MyFunc6() { //익명 이너클래스 만들기
			
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		
		System.out.println("5의 거듭제곱 : " + myFunc6.calc(5));
	}
}
