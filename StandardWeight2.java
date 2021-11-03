package homework;

import java.util.Scanner;

public class StandardWeight2 {
	// 지수 저장할 변수

//	int age, height, weight, gender;
//	double standardWeight;
//	double index;
//	String setBody;

	public StandardWeight2() {
		// 정보입력
	}
	
	public int getinfo(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "=");
		
		return scan.nextInt();  //메세지가 리턴된다.

	}
	// 표준체중

	public double setStandard(int height, int age , int gender) {   //변수 설정
		double standardWeight = (height - 100) * 0.90; // 남,35세이하 /여,36세이상
		if (gender == 1 && age > 36) {
			standardWeight = (height - 100) * 0.95;
		} else if (gender == 2 && age < 36) {
			standardWeight = (height - 100) * 0.85;

		}
		return standardWeight;
	}

	// 표준체중지수
	public double Weightindex(int weight ,double standardWeight ) {
		return (weight / standardWeight) * 100;

	}

	// 체형
	public String setBody(double index) {
		String setBody = "";
		if (index <= 85) {
			setBody = "마른";
		} else if (index >= 86 && index <= 95) {
			setBody = "조금마른";
		} else if (index >= 96 && index <= 115) {
			setBody = "표준";
		} else if (index >= 116 && index <= 125) {
		} else {
			setBody = "비만";

		}
		return setBody;
		
	}
	public void resultOutput(double standardWeight , double index , String setBody) {
		System.out.println("표준체중="+standardWeight);
		System.out.println("당신의 표준체중지수="+index+"으로 "+setBody+"입니다.");
		
	}
	
	public void start() {
		int age = getinfo("나이");
		int height = getinfo("키");
		int gender = getinfo("성별 (남 ==1 , 여 ==2)");
		int weight = getinfo("체중");
		
		double sw = setStandard(height , age , gender); //표준체중
		double index = Weightindex(weight,sw); //
		String setBody = setBody(index);
		resultOutput(sw , index ,setBody);
		
		
	}
	// 출력
	public static void main(String[] args) {
		StandardWeight2 s = new StandardWeight2();
		s.start();
		
	}
	
}
