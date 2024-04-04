package lambda;

//람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다.
//함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스

@FunctionalInterface //함수형 인터페이스
interface MyFunc3 {
	int add(int x, int y);
}

public class Test03 {
	public static void main(String[] args) {
		MyFunc3 myFunc3 = new MyFunc3() {
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc3.add(10, 20);
		System.out.println("res : " + res);
	}
}
