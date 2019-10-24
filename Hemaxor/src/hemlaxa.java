import java.util.Scanner;

public class hemlaxa {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		double radius = input.nextDouble();
		volume(radius);
		
	}
	


	public static double volume(double radius) {
		
		
		double volume = (4 * Math.PI * Math.pow( radius, 3)) / 3;
		 System.out.println(volume);
		
		
		
		
		
		return 0;
	}

	
	
	
	
	
	}
	
	
	
	

