package Talspelet;

import java.util.Scanner;

public class Talspelet {
	
	static int guess;
	
	 static int rigthAnswer = 1+ ((int)(Math.random() * ((12-1) )));
	 
	 static int guessCounter = 1;
	
	 static Scanner str = new Scanner (System.in);

public static void main(String[] args) {
	startMenu();
  }
		
  public static void startMenu() {
       
	  
	  
		System.out.println("Welcome to the Nummber game\n");
		
		System.out.println("Choose difficulty (answer with the corresponding difficulty)\n");
		
		System.out.println("easy: 9 guesses between 1-12");
		
		System.out.println("normal: 10 guesses between 1-25");
		
		System.out.println("hard: 8 guesses between 1-50");
		
        choosenDifficulty();	
}
  
  
  
  public static void choosenDifficulty() {
	  
	  String choosenDifficulty = str.nextLine();
	  
  switch(choosenDifficulty) {
	
	case "easy": System.out.println("You have now choosen the easy difficulty\n ");
	
	easyDifficulty();
	
	break;
	
	case "normal":System.out.println("You haven now choosen the normal difficulty\n");
	
	normalDifficulty();
	break;
	
	case "hard": System.out.println("You have now choosen the hard difficulty\n\n\n");
	
	//kalla på metoden hard
	break;	
	}	
  }
  
  public static void easyDifficulty() {
	  
	  Scanner easy = new Scanner (System.in);
	  
	  System.out.println("Game has started, you have 9 guesses, Good luck!");
	  

	  while( guessCounter<=9) {
		  
		 guess = easy.nextInt();
		   
			  
		if(guess==rigthAnswer ){
		   System.out.println("Congrats! you guessed the right nummber\nTries:" +guessCounter);
		  }
		  
		else if (guess>12) {
			System.out.println("Your guess is outside of the intervall, try again nummbber between 1-12\n");
		}
		
		else if (guess - rigthAnswer == 1) {
            System.out.println("Wrong, but very close");
            
		}
		
		else if (guess - rigthAnswer == -1) {
            System.out.println("Wrong, but very close");
            
		}
		
		  else if(guess<rigthAnswer ){
				
				 System.out.println("Wrong,the nummber is higher\n" );
			  }
		
		  else if(guess>rigthAnswer ) {
			 
			  System.out.println("Wrong! ,the nummber is lower\n ");
		  }
		guessCounter++;
		
	  }
	  
	  System.out.println("Sorry:( You ran out of guesses");
	  System.out.println("The right nummber was:" + rigthAnswer );  
	  
	   }
  
  public static void normalDifficulty() {
	  
	  Scanner normal = new Scanner (System.in);
	  
	  System.out.println("Game has started, you have 10 guesses, Good luck!");
	  
	  
  while( guessCounter<=10) {
	  
		 guess = normal.nextInt();
		   
			  
		if(guess==rigthAnswer ){
		   System.out.println("Congrats! you guessed the right nummber\nTries:" +guessCounter);
		  }
		  
		else if (guess>25) {
			System.out.println("Your guess is outside of the intervall, try again nummbber between 1-25\n");
		}
		
		else if (guess - rigthAnswer == 1) {
         System.out.println("Wrong, but very close");
         
		}
		
		else if (guess - rigthAnswer == -1) {
         System.out.println("Wrong, but very close");
         
		}
		
		  else if(guess<rigthAnswer ){
				
				 System.out.println("Wrong,the nummber is higher\n" );
			  }
		
		  else if(guess>rigthAnswer ) {
			 
			  System.out.println("Wrong! ,the nummber is lower\n ");
		  }
		guessCounter++;
		
	  }
	  
	  System.out.println("Sorry:( You ran out of guesses");
	  System.out.println("The right nummber was:" + rigthAnswer );  
	  
  }
  
	  }

		  


  


  
