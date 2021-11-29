import java.util.Random;
import java.util.Scanner;

public class SixFour {
//int 형 배열의 각 요소에 1~10 의 난수를 대입하고 각 요소의 값을 막대그래프 (기호 문자 *를 나열) 로 표시하는 프로그램 작성, 요소 수는 키보드로 입력,마지막에는 인덱스를 10으로 나눈 나머지 표시	
//배열의 모든 요소에 난수를 대입한 후 막대 그래프로 표시
	
	Random rd = new Random();
	public SixFour() {
	}
	public void start() {
		int n = DataInput("숫자 입력>>");
		int[] num = new int[n];
		
		for (int i = 0; i < n-1; i++) {
			num[i] = 1+ rd.nextInt(10);
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("*");
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("*");
		}
		
		
	}
	public int DataInput(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"");
		return sc.nextInt();
	}

	public static void main(String[] args) {
	new SixFour().start();	
	}

}
