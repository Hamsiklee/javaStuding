import java.util.Random;
import java.util.Scanner;

public class FourThree {
	public FourThree() {
	
	}
		
	public static void main(String[] args) {
		//2�ڸ��� ������ 10~99�� ���ߴ� ���� ���߱� ���� - ���� ����,if���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���߱� ���� ����!!");
		Random rd = new Random();
		
		int result = 10+ rd.nextInt(90);  //������ = result   10~99
		int x ;
		do { 
			 
			System.out.print("���ڸ� �Է��ϼ���.(10~99)");
			x = sc.nextInt();
			if (x>result) {
				System.out.println("�� �۽��ϴ�!");
			} else if(x<result) {
				System.out.println("�� Ů�ϴ�!");
			}
			
		} while (x != result);
		System.out.println("�����Դϴ�!");
		
		
		
	}

}
