package abstracttest;

public class Androidphone extends SmartPhone{
	public void call() {
		double x = 10.75;
		//소수 첫쨰자리 반올림해서 출력하기
		System.out.println("x:" + (int)(x+0.5));
		//소수 도째자리 반올림해서 출력하기
		System.out.println("x:" + ((int)(x*10+0.5))/10.0);
	}
}
