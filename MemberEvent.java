package inheritance;

//이벤트 관련 회원정보(아이디,이름,이메일)를 저장하기 위한 클래스
// => 회원정보를 저장하는 Member 클래스를 상속받아 작성하는 것을 권장
//extends 키워드로 기존 클래스(부모 클래스 - Super Class)를 상속받아 새로운 클래스(자식 클래스 - Sub Class)를 작성
// => 자식 클래스에서는 부모 클래스의 필드 또는 메소드에 접근하여 사용 가능 - 상속성(Inheritance)
// => 단일 상속만 가능 - 부모 클래스를 하나만 설정
public class MemberEvent extends Member {
	/*
	//부모 클래스(Member)를 상속받아 사용 가능하므로 필드 미선언 
	private String id;
	private String name;
	*/
	private String email;

	//super : 자식 클래스의 메소드에서 부모 인스턴스를 저장하기 위한 매개변수(키워드)
	// => super 키워드로 부모 인스턴스의 필드 또는 메소드에 접근하여 사용 가능
	// => super 키워드를 사용하지 않아도 부모 인스턴스의 필드 또는 메소드 접근 가능
	//this 키워드로 자식 인스턴스의 필드 또는 메소드를 참조하여 없는 경우 super 키워드로 
	//부모 인스턴스의 필드 또는 메소드 참조
	
	//super 키워드를 사용해야 되는 경우
	//1.자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하기 위해 사용
	// => 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 명령전에 다른 명령을 작성할 경우 에러 발생
	// => 부모 클래스의 매개변수가 선언된 생성자를 호출하여 부모 인스턴스 필드에 초기값을 설정하기 위해 사용
	//2.자식 클래스의 오버라이드 메소드에서 부모 클래스의 숨겨진 메소드를 호출하기 위해 super 키워드 사용
	public MemberEvent() {
		// TODO Auto-generated constructor stub
		//부모 클래스의 매개변수가 없는 생성자를 호출
		// => 부모 클래스에 매개변수가 없는 생성자가 선언되어 있지 않은 경우 에러 발생
		//super();//명령이 생략되어도 내부적으로 명령이 존재
	}

	/*
	public MemberEvent(String id, String name, String email) {
		super();
		//자식 클래스에서 필드 또는 메소드 접근 순서 : 자식 클래스 참조 >> 부모 클래스 참조
		// => 부모 클래스의 은닉화 선언된 필드 또는 메소드 접근 불가능
		//this.id = id;
		setId(id);
		//this.name = name;
		setName(name);
		this.email = email;
	}
	*/
	
	//[Alt]+[Shift]+[S] >> 팝업 메뉴 >> [O] >> 부모 클래스의 생성자 선택 >> 필드 선택 >> Generate
	public MemberEvent(String id, String name, String email) {
		//부모 클래스의 매개변수가 있는 생성자 호출 - 부모 인스턴스 필드에 초기값 부여
		super(id, name);
		this.email = email;
	}
	
	
	/*
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//메소드 오버라이드(Method Override) : 상속 관계에서 부모 클래스의 메소드를 자식 클래스에서
	//재선언하는 기능 - 부모 클래스의 메소드를 자식 클래스에서 사용하기 부적절한 경우 메소드 재선언
	// => 접근지정자, 반환형, 메소드명, 매개변수, 예외 전달이 모두 같도록 작성
	// => 부모 클래스의 메소드는 숨겨지고 자식 클래스의 메소드만 사용 가능
	/*
	public void display() {
		//System.out.println("아이디 = "+id);
		System.out.println("아이디 = "+getId());
		//System.out.println("이름 = "+name);
		System.out.println("이름 = "+getName());
		System.out.println("이메일 = "+email);
	}
	*/
	
	//이클립스에서 부모 클래스의 메소드를 자식클래스에서 오버라이드 선언하는 방법
	//오버라이드 선언된 부모 클래스의 메소드명 입력 >> [Ctrl]+[Space] >> Override 선택
	//@Override : 오버라이드 메소드를 표현하기 위한 어노테이션(Annotation)
	// => 오버라이드 작성 규칙을 위반하면 에러 발생
	//어노테이션 : API 문서에 특별한 설명을 제공하기 위한 기능 제공
	// => Java Source에 특별한 기능을 제공하기 위해 사용
	@Override
	public void display() {
		//super 키워드로 부모 클래스의 숨겨진 메소드 호출
		super.display();
		System.out.println("이메일 = "+email);
	}
}









