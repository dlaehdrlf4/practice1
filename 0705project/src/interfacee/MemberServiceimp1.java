package interfacee;

import java.io.Serializable;

//MemberService 인터페이스를 implements 한 클래스를 생성
//하나의 인터페이스를 implements 한 클래스의 이름은 인터페이스 이름 뒤에
//imp1을 붙이는것이 관례입니다.
public class MemberServiceimp1 implements MemberService, Serializable { // 인턴페이스는 여러개 되고 상속은 하나만 된다.

	@Override
	public boolean idCheck(String id) {
		boolean result = false;
		
		//id가 root가 아니라면 id가 true
		if(id.equals("root") == false) {
			result = true;	
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		//id가 root이고 password가 1234이면 로그인 성공 - 0
		//id가 root이고 password가 1234가 아니면 비밀번호가 틀림 - 1
		//id가 root가 아니면 없는 id - 2
		
		int result = 2;
		if(id.equals("root"))
		{
			if(password.equals("1234")) {
				return 0;
			}
			else {
				return 1;
			}
	

		}
		return result; //둘다 아니면 2를 반환

	}
}
