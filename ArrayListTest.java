import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		
	}
	public void start() {
		VectorTest vt = new VectorTest();
		List<MemberVo> lst = vt.getArrayList();
		
		for(MemberVo vo : lst) {
			//vo.memberOutput();
			int n = vo.getNum();
			String userid = vo.getUserid();
			String tel = vo.getTel();
			System.out.printf("%d��\t %s��\t %s\n",n,userid,tel);
		}
		System.out.println("=====================================");
		/////////////////////////////////////////////////////
		//�÷����� ��ü�� ��� �迭�� �����ϱ�
		MemberVo arrVO[] = new MemberVo[lst.size()];
		lst.toArray(arrVO);
		
		for( MemberVo aVo : arrVO) {
			aVo.memberOutput();
		}
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
		
	}
}
