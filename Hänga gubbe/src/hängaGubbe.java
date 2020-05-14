import java.util.Random;
import java.util.Scanner;

public class hängaGubbe {
	
	static Scanner input = new Scanner (System.in);
	
	private static int count = 0;

	private static String randomWord;

	private static Object randomIndex;
	
	private static char a =' ';


	

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
		
		String choosenDifficulty =input.nextLine();
		
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
		
		randomizedWord( randomWord);
		
		checkIfContainsIntreger();
		
		System.out.println(a);
		
	
		 

		
	}
	
	
	public static String randomizedWord(Object randomIndex2) {
		
		String[] normalDifficulty = new String[] {"adult" , "aware" , "bunch" , "cringe" , "setup"};
		
		 Random randomizer = new Random();
		 
		 int randomIndex = randomizer.nextInt(normalDifficulty.length);
		
		 randomWord = normalDifficulty[randomIndex];
		 
		 for (int i = 0;i < randomWord.length(); i++){
			    System.out.println(randomWord.charAt(i));
			}

		 
		
		 return(randomWord);
		 
	}
	
	
	
	public static char checkIfContainsIntreger() {
		
		
	while (true){
		
		String playerGuess =input.nextLine();
		
		a = playerGuess.charAt(0);
		
		 if (!Character.isLetter(a)){
             System.out.println("Only enter letters!");
   }
		 else if (Character.isLetter(a)) {
			 
		return (a);
		 }
		 
	}
	
	}
		}
	


	

	
	