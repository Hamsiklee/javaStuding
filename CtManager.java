package Fuck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.management.StringValueExp;

public class CtManager {
	Scanner sc = new Scanner(System.in);

	public CtManager() {

	}

	public void start() {
		boolean logResult = false;
		do {
			String id = DataInput("id=");
			String pwd = DataInput("password=");
			CtLog log = new CtLog();

			logResult = log.CtLogOk(id, pwd);
		} while (!logResult);

		System.out.println("����" + "\t" + "�귣��" + "\t" + "����" + "\t" + "����" + "\t" + "��ġ" + "\t" + "������");

		System.out.println();
//		lst.
		CtArray ca = new CtArray();
		List<CtVO> lst = ca.ctList();
		do {
			String pick = DataInput("1.��Ϻ����ֱ�  2.�����ϱ�  3.�׸��߰�  4.�׸����  5.���� >>>>>");
			if (pick.equals("1")) {
				System.out.println("����" + "\t" + "�귣��" + "\t" + "����" + "\t" + "����" + "\t" + "��ġ" + "\t" + "������");
				for(CtVO cv :lst) {
					System.out.println(cv.tostring());
				}
				
			} else if (pick.equals("2")) {
				removeEa();
				removePlace();
				removePeople();
			}
			else if (pick.equals("3")) {
				
				String newName = DataInput("�����>>");
				
				String newBrand = DataInput("�귣�� �Է�>>");
				
				String newMoney = DataInput("���� �Է�>>");
				
				
				String newEa = DataInput("���� �Է�>>");
				
				String newPlace = DataInput("��� �Է�>>");
				
				String newAdmin = DataInput("�����ڸ�>>");
				
				
				
//				lst.add(0,);
				
				
				
				System.out.println("����" + "\t" + "�귣��" + "\t" + "����" + "\t" + "����" + "\t" + "��ġ" + "\t" + "������");
				
				
				
			} else if (pick.equals("4")) {
				deleteList();
				
			} else {
				endList();
			}

		} while (true);

	}


	public void removeEa() {
		
		
	}

	public void removePlace() {
		
	}

	public void removePeople() {

	}

//		do {
//			
//		}while(remove1.equals(list.))

//	public stvoid addList() {
////
////		String addList1 = DataInput("���� ��ǰ�߰�?(ex:Ű����,Űũ��,3000,���,������)");
////		for (list ls : addList1) {
////
////		}
//		
//		CtVO cv = new CtVO();
//		String newName = DataInput("�����>>");
//		
//		String newBrand = DataInput("�귣�� �Է�>>");
//		
//		String newMoney = DataInput("���� �Է�>>");
//		
//		
//		String newEa = DataInput("���� �Է�>>");
//		
//		String newPlace = DataInput("��� �Է�>>");
//		
//		String newAdmin = DataInput("�����ڸ�>>");
//		
//		CtArray ca = new CtArray();
//		List<CtVO> lst = ca.ctList();
//		CtVO cVO[] = new CtVO[lst.size()];
//		lst.toArray(cVO);
//		
//		for(CtVO aVO : lst) {
//			System.out.println(aVO);
//		}
		
		
//		for( CtVO aVo : cVO) {
//			aVo.title();
//		}
////		
//		System.out.println("����" + "\t" + "�귣��" + "\t" + "����" + "\t" + "����" + "\t" + "��ġ" + "\t" + "������");
//		
//		
//		}
//		
//	

	public void deleteList() {
		
	}

	public void endList() {

	}

	public String DataInput(String msg) {
		System.out.print(msg + "");
		return sc.nextLine();
	}
}
