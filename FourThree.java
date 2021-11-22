import java.util.Random;
import java.util.Scanner;

public class FourThree {
	public FourThree() {
	
	}
		
	public static void main(String[] args) {
		//2자리의 정수값 10~99를 맞추는 숫자 맞추기 게임 - 난수 생성,if문을 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임 시작!!");
		Random rd = new Random();
		
		int result = 10+ rd.nextInt(90);  //랜덤값 = result   10~99
		int x ;
		do { 
			 
			System.out.print("숫자를 입력하세요.(10~99)");
			x = sc.nextInt();
			if (x>result) {
				System.out.println("더 작습니다!");
			} else if(x<result) {
				System.out.println("더 큽니다!");
			}
			
		} while (x != result);
		System.out.println("정답입니다!");
		
		
		
	}

}
