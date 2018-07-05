package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new Iphone();
		smartPhone.call();
		
		smartPhone = new Androidphone();
		smartPhone.call();
		
		//SmartPhone의 인스턴스 생성
		//smartPhone = new SmartPhone();
			
		smartPhone = new WinPhone();
		smartPhone.call();
		
		//final 변수 - 값을 변경할수 없습니다.
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		// ZERO = 1; // 에러 발생
		
		//int command = 1;
		//final int LBUTTIONDOWN = 1;
		//final int RBUTTIONDOWN = 2;
//		if(command == LBUTTIONDOWN) {
//			
//		}
//		else if(command == RBUTTIONDOWN) {
//			
//		}
//	}
	}
}
