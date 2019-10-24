import java.util.Scanner;

public class v41tredje {

	public static void main(String[] args) {
		
		Scanner ny = new Scanner(System.in);
		int i =0;
		int sum=0;
		
		
		boolean running = true;
		while(running) {
			int x =ny.nextInt();
			if(x == 0) {
				running = false;
			}else {
				i++;
				sum = sum + x;
				System.out.println(sum);
				System.out.println(sum/x);
			}
			System.out.println(sum);
			System.out.println(sum/x);
		}
		
		

		}

		
	}
	

