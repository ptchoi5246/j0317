package lambda;

// 람다식을 이용하여 제곱값을 구하시오
//함수적 인터페이스 만들기
@FunctionalInterface
interface MyFunc6_2 { //추상 클래스 1개
	int calc(int x);
}

//원넓이를 람다식으로 구하시고
@FunctionalInterface
interface MyFunc6_2_2 {
	int calc(int r);
}

@FunctionalInterface
interface MyFunc6_2_3 {
	double calc(int r);
}



//계산하기 위한 구현 클래스 - 생성 //이렇게 하기 싫으면 익명 이너 클래스
public class Test06_2 {
	public static void main(String[] args) {
//		MyFunc6_2 myFunc6_2 = new MyFunc6_2() { //익명 이너클래스 만들기
//			
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};
		
		MyFunc6_2 myFunc6_2 = (x) -> x * x;
		System.out.println("5의 거듭제곱 : " + myFunc6_2.calc(5));
		
		MyFunc6_2_2 myFunc6_2_2 = (r) -> (int)(r * r * 3.14);
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_2.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_2.calc(10));
		System.out.println();
		
		MyFunc6_2_3 myFunc6_2_3 = (r) -> r * r * Math.PI;
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_3.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_3.calc(10));
	}
}
