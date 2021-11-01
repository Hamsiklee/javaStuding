package kimkeehoo;

public interface KImkeeho { //인터페이스에는 상수필드랑 추상메소드(간략한) 만 입력가능

	
	//상수필드
	public int Saler = 100;
	public int DontSale = 0;
	
	
	//추상 메소드작성함
	public void turnOn();
	public void turnOff();
	public void setSale(int Sale);
	
}
