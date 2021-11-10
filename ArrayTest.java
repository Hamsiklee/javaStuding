package goingup;

public class ArrayTest {

	public ArrayTest() {
	}
	
	
	public void start() {
		
		
		int[] numbers;
		
		numbers = new int[] {1,2,3};
		
		
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		
	}
	public static void main(String[] args) { 
	
		new ArrayTest().start();
	}
}
