package abstracttest;

public class Iphone extends SmartPhone{
	public void call() {
		System.out.println("아이폰에서 전화걸기");
		double x = 10.7;
		//실수를 정수로 강제 형변환 : 소수가 버려집니다.
		System.out.println("x:" + (int)x);
		}
	}

