
public class SixTwo {
	//��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�������ϴ� ���α׷��� �ۼ��϶�
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
