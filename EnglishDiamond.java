
public class EnglishDiamond {

	public EnglishDiamond() {
	
	}
	
	
	
		
	public void Diamond() {
		char c =  'A';
		
		for(int i= 0; i <=5; i++) {   
            for (int j=1 ; j<=5-i  ; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i+1; j++) {
            	
            	for(int i3 = 0; i3 < 26; i3++) {
            		System.out.print(c++);
            	}
            }
           
            System.out.println();
            
        }
        //го╢э
        for(int i=1; i<=5; i++) {   
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=5-i; j++) {
                System.out.print("*");
            }
            for (int j=3; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

	public static void main(String[] args) {
		
		EnglishDiamond ed = new EnglishDiamond();
		ed.Diamond();
	}

}
