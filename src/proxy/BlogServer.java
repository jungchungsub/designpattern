package proxy;

public class BlogServer implements Server{
	
	@Override
	public void request() {
		System.out.println("요청을 받음");
		System.out.println("json을 java 오브젝트로");
		System.out.println("java object를 json으로");
	}
	
	public void response() {
		System.out.println("응답을함");
	}
}
