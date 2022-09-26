package strategy;

public class Americano implements Coffee{
	
	private final String NAME = "아메리카노";
	
	@Override //재정의가 된것이다.
	public String make() {
		return NAME;
	}
}
