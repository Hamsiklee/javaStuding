import java.util.Scanner;

public class ForTwo {
		Scanner sc = new Scanner(System.in);
	public ForTwo() {
	}
	public void start() {
		//3�ڸ��� �������� �д� 100~999 �� �д� ���α׷��� �ۼ�. 3�ڸ��� ���� ������ �ƴϸ� �ٽ� �Է��ϰ� �Ұ�
		int i;
	
		do {
			i = dataInput("���ڸ��� ������ �Է� = ");
			
		} while(i<100 || i>999);
		System.out.println("�Է��� ���� "+ i +"�Դϴ�.");
		
	}
	
	
	
	public int dataInput(String msg) {
		System.out.println(msg+"");
		return sc.nextInt();
		
		
	}
	
	
	public static void main(String[] args) {
		new ForTwo().start();
		
		
	}

}
 