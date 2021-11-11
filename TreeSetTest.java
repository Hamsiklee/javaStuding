import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {

	}
	
	public void start() {
		int num[] = {32,42,41,42,32,42,32,96,32,83};
		
		
		
		//TreeSet 컬렉션 : 중복 데이터 허용하지 않습니다.
		//		 			입력순서를 유지하지 않는다.
		//					크기순으로 (오름차순으로) 정렬된다.
	
	TreeSet<Integer> ts = new TreeSet();
		for(int n : num) {
			ts.add(n);
		}
	
	//////////////////////////////////
		//tree에서 내림차순으로 객체를 가져온다.
		
		Iterator<Integer> ii = ts.descendingIterator();  //내림차순
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("=============================================");
		Iterator<Integer> iii = ts.iterator();   //오름차순
		while(iii.hasNext()) { //있는지 확인 : hasnext 
			System.out.println(iii.next()); //next로 끄집어냄
		}
	}
	
	public static void main(String[] args) {
		new TreeSetTest().start();

	}

}
