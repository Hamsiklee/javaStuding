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

		System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");

		System.out.println();
//		lst.
		CtArray ca = new CtArray();
		List<CtVO> lst = ca.ctList();
		do {
			String pick = DataInput("1.목록보여주기  2.수정하기  3.항목추가  4.항목삭제  5.종료 >>>>>");
			if (pick.equals("1")) {
				System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");
				for(CtVO cv :lst) {
					System.out.println(cv.tostring());
				}
				
			} else if (pick.equals("2")) {
				removeEa();
				removePlace();
				removePeople();
			}
			else if (pick.equals("3")) {
				
				String newName = DataInput("종목명>>");
				
				String newBrand = DataInput("브랜드 입력>>");
				
				String newMoney = DataInput("가격 입력>>");
				
				
				String newEa = DataInput("수량 입력>>");
				
				String newPlace = DataInput("장소 입력>>");
				
				String newAdmin = DataInput("관리자명>>");
				
				
				
//				lst.add(0,);
				
				
				
				System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");
				
				
				
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
////		String addList1 = DataInput("무슨 상품추가?(ex:키보드,키크론,3000,장소,관리자)");
////		for (list ls : addList1) {
////
////		}
//		
//		CtVO cv = new CtVO();
//		String newName = DataInput("종목명>>");
//		
//		String newBrand = DataInput("브랜드 입력>>");
//		
//		String newMoney = DataInput("가격 입력>>");
//		
//		
//		String newEa = DataInput("수량 입력>>");
//		
//		String newPlace = DataInput("장소 입력>>");
//		
//		String newAdmin = DataInput("관리자명>>");
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
//		System.out.println("종목" + "\t" + "브랜드" + "\t" + "가격" + "\t" + "수량" + "\t" + "위치" + "\t" + "관리자");
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
