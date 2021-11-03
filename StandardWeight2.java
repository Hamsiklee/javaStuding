package homework;

import java.util.Scanner;

public class StandardWeight2 {
	// ���� ������ ����

//	int age, height, weight, gender;
//	double standardWeight;
//	double index;
//	String setBody;

	public StandardWeight2() {
		// �����Է�
	}
	
	public int getinfo(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "=");
		
		return scan.nextInt();  //�޼����� ���ϵȴ�.

	}
	// ǥ��ü��

	public double setStandard(int height, int age , int gender) {   //���� ����
		double standardWeight = (height - 100) * 0.90; // ��,35������ /��,36���̻�
		if (gender == 1 && age > 36) {
			standardWeight = (height - 100) * 0.95;
		} else if (gender == 2 && age < 36) {
			standardWeight = (height - 100) * 0.85;

		}
		return standardWeight;
	}

	// ǥ��ü������
	public double Weightindex(int weight ,double standardWeight ) {
		return (weight / standardWeight) * 100;

	}

	// ü��
	public String setBody(double index) {
		String setBody = "";
		if (index <= 85) {
			setBody = "����";
		} else if (index >= 86 && index <= 95) {
			setBody = "���ݸ���";
		} else if (index >= 96 && index <= 115) {
			setBody = "ǥ��";
		} else if (index >= 116 && index <= 125) {
		} else {
			setBody = "��";

		}
		return setBody;
		
	}
	public void resultOutput(double standardWeight , double index , String setBody) {
		System.out.println("ǥ��ü��="+standardWeight);
		System.out.println("����� ǥ��ü������="+index+"���� "+setBody+"�Դϴ�.");
		
	}
	
	public void start() {
		int age = getinfo("����");
		int height = getinfo("Ű");
		int gender = getinfo("���� (�� ==1 , �� ==2)");
		int weight = getinfo("ü��");
		
		double sw = setStandard(height , age , gender); //ǥ��ü��
		double index = Weightindex(weight,sw); //
		String setBody = setBody(index);
		resultOutput(sw , index ,setBody);
		
		
	}
	// ���
	public static void main(String[] args) {
		StandardWeight2 s = new StandardWeight2();
		s.start();
		
	}
	
}
