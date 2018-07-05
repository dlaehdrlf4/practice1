package innerclass;

public class Main {

	public static void main(String[] args) {
		TreadEx obj = new TreadEx();
		obj.start();
		
		//Thread 클래스의 Anonoymous 만들기 한번만 쓸 때 이걸 쓴다 왜냐 메모리 효율이 더 좋기 떄문이다.
		Thread th = new Thread() {
			public void run() {
				try {
					for(int i=10;i<20;i=i+1) {
						System.out.println(i);
						Thread.sleep(1000); //1초씩 찍어준다
					}
				}
				catch(Exception e) {}
			}
			
		};
		th.start(); // 메소드 실행
	}

}
