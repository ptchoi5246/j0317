package lambda;

//람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다.
//함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스

@FunctionalInterface //함수형 인터페이스
interface MyFunc5 {
	int add(int x, int y);
}

public class Test05 {
	public static void main(String[] args) {
//		MyFunc5 myFunc5 = new MyFunc5() {
//			
//			@Override
//			public int add(int x, int y) {
//				int res = x + y;
//				return res;
//			}
//		};
		
		MyFunc5 myFunc5 = (x, y) -> x + y;
		//인터페이스 생성 = (변수) -> 실행할 내용
		
		int res = myFunc5.add(40, 50);
		System.out.println("res : " + res);
	}

}
