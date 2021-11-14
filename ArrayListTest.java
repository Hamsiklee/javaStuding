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
			System.out.printf("%d번\t %s님\t %s\n",n,userid,tel);
		}
		System.out.println("=====================================");
		/////////////////////////////////////////////////
		//컬렉션의 객체를 모두 배열로 저장하기
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
