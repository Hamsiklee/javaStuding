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
		
		System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");
					CtArray.ctList();
	
					System.out.println();
				
		
	 do {
		 
		 String pick = DataInput("1.목록보여주기  2.수정하기  3.항목추가  4.항목삭제  5.종료 >>>>>");		
		 if (pick.equals("1")) {
			 System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");	
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
		String what = DataInput("수정할 브랜드명");
		
		removeEa(what);
		removePlace(what);
		removePeople(what);
		
	}
	
	
	
	public void removeEa(String brand) {
		String rEa = DataInput("수정할 수량 입력");
//		CtVO vo = new CtVO();
//		vo.setEa(rEa);
		
	
	}
	public void removePlace(String brand) {
		String rPlace = DataInput("수정할 위치 입력");
		CtVO vo = new CtVO();
		vo.setPlace(rPlace);
	}
	public void removePeople(String brand) {
		String rPeople = DataInput("수정할 관리자 입력");
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
		
		String addList1 =DataInput("무슨 상품추가?(ex:키보드,마우스)");
		String addList2 =DataInput("브랜드 이름? ");
		String addList3 =DataInput("추가할 이름");
		
		
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
