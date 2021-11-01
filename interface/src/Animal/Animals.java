package Animal;

public class Animals implements Dog, Cat {

	public static void main(String[] args) {
		Animals animals = new Animals();
		animals.crying();
		animals.one();
		animals.two();
		
		

	}

	@Override
	public void crying() {
		System.out.println("컹컹");
	
	}

	@Override
	public void two() {
		System.out.println("Two");
		
	}

	@Override
	public void one() {
		System.out.println("one");
		
	}

}
