package adapter.lib;

import adapter.ex01.EmailSend;

public class Email implements EmailSend{

	@Override
	public String send() {
		System.out.println("진짜 메시지가 이메일로 전송됨");
		return "진짜 감사합니다 메시지를 받음";
	}

}
