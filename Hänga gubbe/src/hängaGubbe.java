import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hängaGubbe {
	
	static Scanner input = new Scanner (System.in);
	
	private static int count = 0;

	private static char storedWord = ' ';
	
	private static String randomWord;

	private static Object randomIndex;
	
	private static char playerGuessLetter =' ';
	
	private static char[] playerGuess = new char ['_'];
	
	static int amountOfGuesses = 7;
	
	static int wrongGuessCounter= 0;
	

	

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
		
    	randomizedWord();
    
    	
    	 for(int i = 0; i < randomWord.length(); i++) {
			 playerGuess[i] ='_';
		 }
		 
    	
  
		boolean wordIsGuessed = false;
		
		 while(wrongGuessCounter<= 7 && !wordIsGuessed) {
			 
			 System.out.println("Current guesses");
			 
			printArray(playerGuess);
			 
			 System.out.printf("You have this many guesses left:", amountOfGuesses - count);
			 
			 checkIfContainsIntreger();
				
				
				for(int i =0;i < randomWord.length(); i++) {
					
					if(randomWord.charAt(i) == playerGuessLetter) {
						
					playerGuess[i] = playerGuessLetter;
					
					isTheWordGuessed(playerGuess);
					}
					
					
					else if (!(randomWord.charAt(i) == playerGuessLetter)) {
						System.out.println("Wrong!!");
						
						wrongGuessCounter++;
						
						wrongGuess();
						
						
					}
					break;
				}
				
				}
		    }
    
	private static void printArray(char[] playerGuess) {
		
		for(int i =0;i < playerGuess.length; i++) {
			
			System.out.print(playerGuess[i] + " ");
		}

		
		
	}


	public static String randomizedWord() {
		
		String[] randomWords= new String[] {"adult" , "aware" , "bunch" , "jumps" , "setup"};
		
		char randomWordSeparated [] = new char [5];
	
		 Random randomizer = new Random();
		 
		 int randomIndex = randomizer.nextInt(randomWords.length);
		
		 randomWord = randomWords[randomIndex];
		 	
			
		 return(randomWord);
		 
	}
	
	
	
	public static char checkIfContainsIntreger() {
		
		System.out.println("Enter your guess below");
		
	while (true){
		
		String playerGuessWord =input.nextLine();
		
		playerGuessLetter = playerGuessWord.charAt(0);
		
		 if (!Character.isLetter(playerGuessLetter)){
             System.out.println("Only enter letters!");
   }
		 else if (Character.isLetter(playerGuessLetter)) {
			 
			
		return (playerGuessLetter);
		 }
		 
	}
	
	}
	
      private static boolean isTheWordGuessed(char[] playerGuess) {
		
		for(int i =0;i < playerGuess.length; i++) {
			
		if(playerGuess[i] == '_');
		
		return false;
		}
		
		
		return true;
	}

       private static void wrongGuess() {
    	   
    	   
    	   switch(wrongGuessCounter) {
    	   
    	   case 1 : System.out.print(" "
    	   		+ "   +---+\n" +
                   "  |   |\n" +
                   "      |\n" +
                   "      |\n" +
                   "      |\n" +
                   "      |\n" +
                   "=========''', '''");;
    	   System.out.println("You now only have 6 guesses left");
    	   
    	   break;
    	   
    	   case 2 :System.out.print("  "
    	   		+ "   +---+\n" +
                   "  |   |\n" +
                   "  O   |\n" +
                   "      |\n" +
                   "      |\n" +
                   "      |\n" +
                   "=========''', '''");
           System.out.println("You have 5 guesses left!");
           break;
           
    	   case 3:
               System.out.print("  "
               		+ "   +---+\n" +
                       "  |   |\n" +
                       "  O   |\n" +
                       "  |   |\n" +
                       "      |\n" +
                       "      |\n" +
                       "=========''', '''");
               System.out.println("You have 4 guesses left!!");
               break;
    	   
    	   case 4 : 
    		   System.out.print(" "
               		+ "   +---+\n" +
                       "  |   |\n" +
                       "  O   |\n" +
                       " /|   |\n" +
                       "      |\n" +
                       "      |\n" +
                       "=========''', '''");
               System.out.println("You have 3 guesses left!!!");
               break;
               
    	   case 5 :
    		   System.out.print(" "
    		   		+ "   +---+\n" +
                       "  |   |\n" +
                       "  O   |\n" +
                       " /|\\ |\n" +
                       "      |\n" +
                       "      |\n" +
                       "=========''', '''");
               System.out.println("You have 2 guesses left!!!!");
               break;
               
    	   case 6 :
    		   System.out.print(" "
    		   		+ "   +---+\n" +
                       "  |   |\n" +
                       "  O   |\n" +
                       " /|\\ |\n" +
                       " /    |\n" +
                       "      |\n" +
                       "=========''', '''");
               System.out.println("You are on your last guess, choose wisely");
               break;
               
    	   case 7 :
    		   System.out.print(" "
    		   		+ "   +---+\n" +
                       "  |   |\n" +
                       "  O   |\n" +
                       " /|\\ |\n" +
                       " / \\ |\n" +
                       "      |\n" +
                       "=========''']");
               System.out.println("You didnt manage to guess the right word:(");
               System.out.println("The  rigth word was:" + " " + randomWord);
               break;
    	   
    	   
    	   
    	   }

    	   
    	   
	
	
}
	

}
	

	
	