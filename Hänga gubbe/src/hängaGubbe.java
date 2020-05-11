import java.util.Random;
import java.util.Scanner;

public class hängaGubbe {
	
	static Scanner str = new Scanner (System.in);
	
	 static Random random = new Random();
	
	static String[] normal = new String[] {"adult" , "aware" , "bunch" , "cringe" , "setup"};
	
	static int normalWord = random.nextInt(normal.length);
	
	static String randomWord = normal[normalWord];
	
	private static int count = 0;
	


	public static void main(String[] args) {
		
		welcomeToGame();
		
		}
	

	public static void welcomeToGame(){
		
		System.out.println("Welcome to the hang-man game\n");
		System.out.println("In this game the aim is to\n" + "guess the correct word in order to win," + "Good luck!\n");
		System.out.println("Before you can start playing the game, please select the prefered difficulty\n\n");
		
		chooseDifficulty();
	}
	
	
	
	public static void chooseDifficulty() {
		
		//skilja åt de två olika delarna
		System.out.println("---------------------------------------------------------------------------------------");
		
		
		System.out.println("Normal: The normal mode gives you shorter and easier words to guess.\n");
		System.out.println("Hard: Hard mode give you both longer and harder words to guess.\n\n\n");
		System.out.println("Please select the prefered difficulty by writing down normal or hard.\n\n\n");
		System.out.println("---------------------------------------------------------------------------------");
		choosenDifficulty();
	}
	
	public static void choosenDifficulty() {
		
		String choosenDifficulty =str.nextLine();
		
		switch(choosenDifficulty) {
		
		case "normal" : System.out.println("You have choosen the normal difficulty\n\n");
		
		normalDifficulty();
			
			break;
			
			
		case "hard" : System.out.println("You have choosen the hard difficulty");
		
		//hardDifficulty 
		
		break;
		}
		
	}

	public static void normalDifficulty() {
		
		
		
		System.out.println(normalWord);
		 
		
		
	}
	
}
