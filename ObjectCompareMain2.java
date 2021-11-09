import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain2 {

	public ObjectCompareMain2() { 
	
	}
	public void start() {
		//컬렉션 객체내의 객체에 포함된 데이터를 이용하여 정렬하기    ///객체 안의 객체의 데이터를 꺼내와서 정렬하기
		//기본 데이터 세팅하기
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		
		empList.add(new EmployeeVO(13,"박태환","010-1111-1111","사원","abc@nate.com"));
		empList.add(new EmployeeVO(5,"김연아","010-2222-2222","대리","zzz@naver.com"));
		empList.add(new EmployeeVO(50,"박지성","010-3333-3333","과장","xbbb@naver.com"));
		empList.add(new EmployeeVO(120,"손흥민","010-4444-4444","대리","ggg@naver.com"));
		empList.add(new EmployeeVO(35,"추신수","010-5555-6666","부장","ccczz@naver.com"));
		empList.add(new EmployeeVO(90,"안정환","010-7777-7777","본부장","lllzzz@naver.com"));
		empList.add(new EmployeeVO(22,"이동국","010-9999-9999","주임","dszzz@naver.com"));
		
		
		System.out.println("===============정렬전=======================");
		
		for(EmployeeVO vo :empList) {   //emplist를 vo 에 넣는다. 없을때까지
			 System.out.println(vo.toString()); //VO클래스의  tostring 메소드를 이용해 출력
		}
		//정렬하는 기능
		//번호는 번호끼리 , 이름은 이름끼리 
		//이름을 오름차순으로 정렬하기   /// comareNameAsc를 객체로 만들어서 두번째 칸에 넣기
		Collections.sort(empList,new CompareNameAsc());
		  
		System.out.println("====이름을 오름차순으로 정렬====");
		for(EmployeeVO vo :empList) {
			System.out.println(vo.toString());
		}
	
	
		//이름을 내림차순으로 정렬하기
		Collections.sort(empList, new CompareNameDes());
		System.out.println("=======이름을 내림차순으로 정렬=========");
		for(EmployeeVO vo :empList) {
			System.out.println(vo.toString());
		}
		Collections.sort(empList, new CompareSabunAsc());//기준을 알려주는 메소드를 오른쪽
		System.out.println("=============사원번호를 오름차순으로 정렬===============");
		for(EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		//사원번호를 내림차순으로 정렬
		Collections.sort(empList, new CompareSabunDesc());
		System.out.println("=============사원번호를 내림차순으로 정렬===============");
		for(EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
				
		//직급을 내림차순으로 정렬
		Collections.sort(empList, new ComparePositionDesc());
		System.out.println("=============직급을 내림차순으로 변경===============");
		for (EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		
		//이메일을 오름차순으로 정렬
		Collections.sort(empList, new ComplareEmailAsc());
		System.out.println("=============이메일을 오림차순으로 변경===============");
		for (EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		
		
	
	
	}
	//이메일을 오름차순으로 정렬
	class ComplareEmailAsc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO e1, EmployeeVO e2) {
			// TODO Auto-generated method stub
			return e1.getEmail().compareTo(e2.getEmail());
		}
		
	}
	
	
	
	//직급을 내림차순으로 정렬
	
	
	class ComparePositionDesc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO p1, EmployeeVO p2) {
			
			return p2.getPosition().compareTo(p1.getPosition());
		}
		
	}
	
	
	
	
	
	
	
	//Comparator인터페이스를 상속받아 compare() 메소드 오버라이딩 한다
	//사원번호로 내림차순 정렬하는 내부 클래스
	class CompareSabunDesc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO o1, EmployeeVO o2) {
			// TODO Auto-generated method stub
			return (o1.getSabun() < o2.getSabun())? 1: (o1.getSabun() > o2.getSabun())? -1 : 0 ;
		
	}
	
	
	
	}
	
	
	//Comparator 인터페이스 를 상속받아 compare() 메소드를 오버라이딩 한다.
	//사원번호로 오름차순 정렬하는 내부클래스
	class CompareSabunAsc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO o1, EmployeeVO o2) {
			// 양수일때 두개의 값을 교환한다. 
			
			
				//삼항연산자 : 왼쪽이 크면 양수
			return (o1.getSabun() > o2.getSabun())? 1: (o1.getSabun() < o2.getSabun())? -1 : 0 ;
		}
		
	}
	
	
	
	
	
	
	//====================사원명(이름)을 기준으로 오름차순 정렬하는 내부 클래스 ===================
	class CompareNameAsc implements Comparator<EmployeeVO>{   //comparator 는 추상메소드 이므로 오버라이딩을 해줘야 한다.

		@Override     //sort 메소드가 compare 메소드를 사용한다.
		public int compare(EmployeeVO o1, EmployeeVO o2) {  //첫번째 o1은 13(박태환) , o2 는  5(김연아)   //아래쪽으로 가면서 비교하면서 내려감
			// TODO Auto-generated method stub  
			//A  B 
			
			
			//왼쪽의 객체가 작을때는 -1 , 같을때는  0 , 클때는 1
			return o1.getUsername().compareTo(o2.getUsername());
		} 
		
	}
	// == 사원명(이름) 을 기준으로 내림차순정렬하는 내부 클래스
	
	class CompareNameDes implements Comparator<EmployeeVO>//추상클래스인 implements를 상속받고
	
	{
	@Override
	public int compare(EmployeeVO v1, EmployeeVO v2) {
		//반대로 처음부터 박태환 김연아를 비교하여 작은것이 뒤로 가게끔 만든다.
		return v2.getUsername().compareTo(v1.getUsername());
	}
	}
	
	public static void main(String[] args) {
		new ObjectCompareMain2().start();
	}
	}


