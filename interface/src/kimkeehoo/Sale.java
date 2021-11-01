package kimkeehoo;

public class Sale implements KImkeeho{
	private int sale;

	@Override
	public void turnOn() {
		System.out.println("김기호님의 세일력을 켭니다.");
	
		
	}

	@Override
	public void turnOff() {
		System.out.println("김기호님의 세일력을  끕니다.");
	}

	@Override
	public void setSale(int Sale) {
		if(sale>KImkeeho.Saler) {
			this.sale = KImkeeho.Saler;
		}else {this.sale =sale;
		}
	System.out.println("현재 김기호님의 세일력 = "+this.sale);
		}
		
	}

