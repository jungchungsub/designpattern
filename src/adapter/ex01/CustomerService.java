package adapter.ex01;

// 고객의 클레임이 들어오면
// 사과 이메일 보내기
// 이메일 답장을 DB 저장하기 
public class CustomerService {
	
	private EmailSend email;
	

	public CustomerService(EmailSend email) {
		this.email = email;
	}

	// 가짜 객체를 만들어야 된다. 
	//1. Email를 만드는 친구한테가서 Email을 EmailSend라는 인터페이스로 구현해서 만들어
	//2. EmailAdapter 만들기 
	
	public void acceptClaim(String msg) {
		String acceptMsg = msg; //받는코드
		System.out.println("클레임 내용:" + acceptMsg);
		sendEmail();
		
	}
	
	public void sendEmail() {
		String result = email.send();
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다. :" + result);
	}
	
	
}


