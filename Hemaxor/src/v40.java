import java.util.Scanner;

public class v40 {

	public static void main(String[] args) {
		
		Scanner ny= new Scanner(System.in);
		
		int x=ny.nextInt();
		int y=ny.nextInt();
		int n=ny.nextInt();
		int i=0;
		
		for( i=1;i<=n;i++) {
			if(i % x != 0 && i % y != 0) 
				System.out.println(i);
			else {
				if (i%x==0)
				System.out.println("fizz");
				if(i%y==0)
					System.out.println("buzz");
				if(i%x==0 && i%y==0)
					System.out.println("Fizz and buzz");
			}
			
		}
		
		
	}
	
	
}
