import java.util.Random;
import java.util.Scanner;

public class SixFour {
//int �� �迭�� �� ��ҿ� 1~10 �� ������ �����ϰ� �� ����� ���� ����׷��� (��ȣ ���� *�� ����) �� ǥ���ϴ� ���α׷� �ۼ�, ��� ���� Ű����� �Է�,���������� �ε����� 10���� ���� ������ ǥ��	
//�迭�� ��� ��ҿ� ������ ������ �� ���� �׷����� ǥ��
	
	Random rd = new Random();
	public SixFour() {
	}
	public void start() {
		int n = DataInput("���� �Է�>>");
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
