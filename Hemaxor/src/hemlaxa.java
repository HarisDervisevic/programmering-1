import java.util.Scanner;

public class hemlaxa {


	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
	
		double radius = input.nextDouble();
		volume(radius);
		
	    System.out.println(reverse("glass"));

	}
	


	public static double volume(double radius) {
		
		
		double volume = (4 * Math.PI * Math.pow( radius, 3)) / 3;
		 System.out.println(volume);
		 
		 return 0;
	}

	public static String reverse(String Stringreverse) {
		
		String reversedstring = "";
		
		for(int i = Stringreverse.length() - 1; i >= 0; i--)
		
		{
             reversedstring += Stringreverse.charAt(i);
        }
    
		
		return reversedstring;
	
		}
	
	}
	
	
	
	

