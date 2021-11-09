import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain2 {

	public ObjectCompareMain2() { 
	
	}
	public void start() {
		//�÷��� ��ü���� ��ü�� ���Ե� �����͸� �̿��Ͽ� �����ϱ�    ///��ü ���� ��ü�� �����͸� �����ͼ� �����ϱ�
		//�⺻ ������ �����ϱ�
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		
		empList.add(new EmployeeVO(13,"����ȯ","010-1111-1111","���","abc@nate.com"));
		empList.add(new EmployeeVO(5,"�迬��","010-2222-2222","�븮","zzz@naver.com"));
		empList.add(new EmployeeVO(50,"������","010-3333-3333","����","xbbb@naver.com"));
		empList.add(new EmployeeVO(120,"�����","010-4444-4444","�븮","ggg@naver.com"));
		empList.add(new EmployeeVO(35,"�߽ż�","010-5555-6666","����","ccczz@naver.com"));
		empList.add(new EmployeeVO(90,"����ȯ","010-7777-7777","������","lllzzz@naver.com"));
		empList.add(new EmployeeVO(22,"�̵���","010-9999-9999","����","dszzz@naver.com"));
		
		
		System.out.println("===============������=======================");
		
		for(EmployeeVO vo :empList) {   //emplist�� vo �� �ִ´�. ����������
			 System.out.println(vo.toString()); //VOŬ������  tostring �޼ҵ带 �̿��� ���
		}
		//�����ϴ� ���
		//��ȣ�� ��ȣ���� , �̸��� �̸����� 
		//�̸��� ������������ �����ϱ�   /// comareNameAsc�� ��ü�� ���� �ι�° ĭ�� �ֱ�
		Collections.sort(empList,new CompareNameAsc());
		  
		System.out.println("====�̸��� ������������ ����====");
		for(EmployeeVO vo :empList) {
			System.out.println(vo.toString());
		}
	
	
		//�̸��� ������������ �����ϱ�
		Collections.sort(empList, new CompareNameDes());
		System.out.println("=======�̸��� ������������ ����=========");
		for(EmployeeVO vo :empList) {
			System.out.println(vo.toString());
		}
		Collections.sort(empList, new CompareSabunAsc());//������ �˷��ִ� �޼ҵ带 ������
		System.out.println("=============�����ȣ�� ������������ ����===============");
		for(EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		//�����ȣ�� ������������ ����
		Collections.sort(empList, new CompareSabunDesc());
		System.out.println("=============�����ȣ�� ������������ ����===============");
		for(EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
				
		//������ ������������ ����
		Collections.sort(empList, new ComparePositionDesc());
		System.out.println("=============������ ������������ ����===============");
		for (EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		
		//�̸����� ������������ ����
		Collections.sort(empList, new ComplareEmailAsc());
		System.out.println("=============�̸����� ������������ ����===============");
		for (EmployeeVO vo : empList) {
			System.out.println(vo.toString());
		}
		
		
	
	
	}
	//�̸����� ������������ ����
	class ComplareEmailAsc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO e1, EmployeeVO e2) {
			// TODO Auto-generated method stub
			return e1.getEmail().compareTo(e2.getEmail());
		}
		
	}
	
	
	
	//������ ������������ ����
	
	
	class ComparePositionDesc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO p1, EmployeeVO p2) {
			
			return p2.getPosition().compareTo(p1.getPosition());
		}
		
	}
	
	
	
	
	
	
	
	//Comparator�������̽��� ��ӹ޾� compare() �޼ҵ� �������̵� �Ѵ�
	//�����ȣ�� �������� �����ϴ� ���� Ŭ����
	class CompareSabunDesc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO o1, EmployeeVO o2) {
			// TODO Auto-generated method stub
			return (o1.getSabun() < o2.getSabun())? 1: (o1.getSabun() > o2.getSabun())? -1 : 0 ;
		
	}
	
	
	
	}
	
	
	//Comparator �������̽� �� ��ӹ޾� compare() �޼ҵ带 �������̵� �Ѵ�.
	//�����ȣ�� �������� �����ϴ� ����Ŭ����
	class CompareSabunAsc implements Comparator<EmployeeVO>{

		@Override
		public int compare(EmployeeVO o1, EmployeeVO o2) {
			// ����϶� �ΰ��� ���� ��ȯ�Ѵ�. 
			
			
				//���׿����� : ������ ũ�� ���
			return (o1.getSabun() > o2.getSabun())? 1: (o1.getSabun() < o2.getSabun())? -1 : 0 ;
		}
		
	}
	
	
	
	
	
	
	//====================�����(�̸�)�� �������� �������� �����ϴ� ���� Ŭ���� ===================
	class CompareNameAsc implements Comparator<EmployeeVO>{   //comparator �� �߻�޼ҵ� �̹Ƿ� �������̵��� ����� �Ѵ�.

		@Override     //sort �޼ҵ尡 compare �޼ҵ带 ����Ѵ�.
		public int compare(EmployeeVO o1, EmployeeVO o2) {  //ù��° o1�� 13(����ȯ) , o2 ��  5(�迬��)   //�Ʒ������� ���鼭 ���ϸ鼭 ������
			// TODO Auto-generated method stub  
			//A  B 
			
			
			//������ ��ü�� �������� -1 , ��������  0 , Ŭ���� 1
			return o1.getUsername().compareTo(o2.getUsername());
		} 
		
	}
	// == �����(�̸�) �� �������� �������������ϴ� ���� Ŭ����
	
	class CompareNameDes implements Comparator<EmployeeVO>//�߻�Ŭ������ implements�� ��ӹް�
	
	{
	@Override
	public int compare(EmployeeVO v1, EmployeeVO v2) {
		//�ݴ�� ó������ ����ȯ �迬�Ƹ� ���Ͽ� �������� �ڷ� ���Բ� �����.
		return v2.getUsername().compareTo(v1.getUsername());
	}
	}
	
	public static void main(String[] args) {
		new ObjectCompareMain2().start();
	}
	}


