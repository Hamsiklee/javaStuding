package Fuck;

import java.util.List;
import java.util.Scanner;


public class CtManager {
	Scanner sc = new Scanner(System.in);
//	List
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
					CtArray.ctList();
	
					System.out.println();
				
		
	 do {
		 
		 String pick = DataInput("1.��Ϻ����ֱ�  2.�����ϱ�  3.�׸��߰�  4.�׸����  5.���� >>>>>");		
		 if (pick.equals("1")) {
			 System.out.println("����" + "\t" + "�귣��" + "\t" + "����" + "\t" + "����" + "\t" + "��ġ" + "\t" + "������");	
			 CtArray.ctList();
		}else if(pick.equals("2")){
			remove();
		}else if(pick.equals("3")){
				addList();
		}else if(pick.equals("4")) {
				deleteList();
		}else{ endList();}
			
	 }while(true);
		 
	}
		
	public void remove() {
		String what = DataInput("������ �귣���");
		
		removeEa(what);
		removePlace(what);
		removePeople(what);
		
	}
	
	
	
	public void removeEa(String brand) {
		String rEa = DataInput("������ ���� �Է�");
//		CtVO vo = new CtVO();
//		vo.setEa(rEa);
		
	
	}
	public void removePlace(String brand) {
		String rPlace = DataInput("������ ��ġ �Է�");
		CtVO vo = new CtVO();
		vo.setPlace(rPlace);
	}
	public void removePeople(String brand) {
		String rPeople = DataInput("������ ������ �Է�");
		CtVO vo = new CtVO();
		vo.setAdmin(rPeople);
		CtArray.ctList();
	}
	
		
			
//		do {
//			
//		}while(remove1.equals(list.))
		
		
	
	public void listList() {

	}
	

	public void addList() {
		
		String addList1 =DataInput("���� ��ǰ�߰�?(ex:Ű����,���콺)");
		String addList2 =DataInput("�귣�� �̸�? ");
		String addList3 =DataInput("�߰��� �̸�");
		
		
	}
	public void deleteList() {
		
	}
	public void endList() {
		
	}

	public String DataInput(String msg) {
		System.out.print(msg + "");
		return sc.nextLine();
	}
}
