import java.util.Scanner;

public class ForTwo {
		Scanner sc = new Scanner(System.in);
	public ForTwo() {
	}
	public void start() {
		//3자리의 정숫값을 읽는 100~999 을 읽는 프로그램을 작성. 3자리의 양의 정수가 아니면 다시 입력하게 할것
		int i;
	
		do {
			i = dataInput("세자리의 정수값 입력 = ");
			
		} while(i<100 || i>999);
		System.out.println("입력한 값은 "+ i +"입니다.");
		
	}
	
	
	
	public int dataInput(String msg) {
		System.out.println(msg+"");
		return sc.nextInt();
		
		
	}
	
	
	public static void main(String[] args) {
		new ForTwo().start();
		
		
	}

}
 