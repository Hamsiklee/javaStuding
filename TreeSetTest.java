import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {

	}
	
	public void start() {
		int num[] = {32,42,41,42,32,42,32,96,32,83};
		
		
		
		//TreeSet �÷��� : �ߺ� ������ ������� �ʽ��ϴ�.
		//		 			�Է¼����� �������� �ʴ´�.
		//					ũ������� (������������) ���ĵȴ�.
	
	TreeSet<Integer> ts = new TreeSet();
		for(int n : num) {
			ts.add(n);
		}
	
	//////////////////////////////////
		//tree���� ������������ ��ü�� �����´�.
		
		Iterator<Integer> ii = ts.descendingIterator();  //��������
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("=============================================");
		Iterator<Integer> iii = ts.iterator();   //��������
		while(iii.hasNext()) { //�ִ��� Ȯ�� : hasnext 
			System.out.println(iii.next()); //next�� �����
		}
	}
	
	public static void main(String[] args) {
		new TreeSetTest().start();

	}

}
