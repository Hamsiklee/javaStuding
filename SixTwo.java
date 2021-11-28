
public class SixTwo {
	//요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을대입하는 프로그램을 작성하라
	public SixTwo() {
		
	}
	public void start() {
	int[] num = new int[5];
	
	for (int i = 0; i < num.length; i++) {
		num[i] = 5 -i;
	}
	for (int i = 0; i < num.length; i++) {
		System.out.println("num["+i+"] = "+num[i]);
	}	
		
		
	}
	public static void main(String[] args) {
	new SixTwo().start();
		
		
	}

}
