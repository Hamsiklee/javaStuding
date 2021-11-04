import java.util.Calendar;

public class WrapperClass { //기본데이터에 상응하는 것이 존재한다.

	public WrapperClass() {
		//Wrapper 클래스는 기본데이터형을 객체형으로 변환하는 클래스들을 말한다.
		// 정수 : Byte , Short , Integer , Long 
		// 실수 : Float , Double
		// 논리 : Boolean
		// 문자 : Character
		
		
		int num = 130;
		Integer numObj = new Integer(num);
		Integer numObj2 = Integer.valueOf(num);
		Integer numObj3 = num; //autorBoxing 기본 데이터형이 객체형으로 자동으로 변환되는 것 
		System.out.println("바이트 수>> "+numObj3.BYTES); //바이트 크기 
		System.out.println("  비트 수>> "+numObj3.SIZE);	//비트수 
		System.out.println("  큰   값>> "+numObj3.MAX_VALUE);	// 제일 큰 수 
		System.out.println("  작은 수>> "+numObj3.MIN_VALUE);	//	제일 작은 수
		System.out.println(" 데이터형>> "+numObj3.TYPE);
		
		
		System.out.println(Byte.MAX_VALUE);
		byte numByte = (byte)num; // - 128 ~ 127
		System.out.println("numByte = "+numByte);
		
		//Integer 클래스는 byte 타입으로 변경하는 메소드 찾기
		//intvalue = int로 구해주고 , longvalue 는 long 으ㅡ로 구해준다 , ---value 는 ---로 구해준다.
		byte numByte2 = numObj3.byteValue();
		System.out.println("numbtye2  = "+numByte2); //Integer 클래스를 byte 타입으로 변경하는 메소드
		
		System.out.println("100을 16진수 >>"+Integer.toHexString(100));
		System.out.println(num+"을 16진수 >>"+Integer.toHexString(numObj3));
		
		
		int num4 = numObj3; //autoUnboxing : 객체형이 기본데이터형으로 변환하여 대입된다.
	}

	public static void main(String[] args) {
		new WrapperClass();
	
		
	}

}
