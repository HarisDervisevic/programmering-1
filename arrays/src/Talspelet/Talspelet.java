package Talspelet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Talspelet {
	
	static int guess;
	 
	 static int guessCounter = 1;
	
	 static Scanner str = new Scanner (System.in);
	 
	 static Scanner diff = new Scanner (System.in);
	 
	 /**
	  * Denna metoden startar spelet
	  * @param args
	  */

public static void main(String[] args) {
	startMenu();
  }
		
   /** Detta är start menyn som väkommnar dig in i spelet och du väljer även vilken svårighetsgrad 
   * du vill köra på och ger dig anatlet gissningar du får och intervallet på svårighetsgraden
   */
  public static void startMenu() {
       
	  
	  
		System.out.println("Welcome to the Nummber game\n");
		
		System.out.println("Choose difficulty (answer with the corresponding difficulty)\n");
		
		System.out.println("easy: 9 guesses between 1-12");
		
		System.out.println("normal: 10 guesses between 1-25");
		
		System.out.println("hard: 8 guesses between 1-50");
		
        choosenDifficulty();	
}
  
  
  /**
   * Denna metoden kallar på svårighetsgraden man valt och här valde jag att använda mig av 
   * switch case, som kalla på den svårighetsgrad användraen valt
   */
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
	
	hardDifficulty();
	break;	
	}	
  }
  
  /**
   * Denna metoden är den som kör själva spelet fast den enklaste svårighetsgraden där while
   * loopen lörs till användaren gissat rätt. Kallar även på doesIntContain som kör try catch på
   * gissningen för att se ifall det är en siffra. När man gissat rätt kommer man till anotherRound
   * metoden som frågar om du vill köra om igen. Här är även ledtrådarna mer exakta
   */
  
  public static void easyDifficulty() {
	  
	  int rigthAnswer = 1+ ((int)(Math.random() * ((12-1) )));
	  
	  System.out.println("Game has started, you have 9 guesses, Good luck!");
	  

	  while( guessCounter<=9) {
		  
		  int guess = doesIntConatin();
		  
		if(guess==rigthAnswer ){
		   System.out.println("Congrats! you guessed the right nummber\nTries:" +guessCounter);
		   
		   anotherRound();
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
  
  /**
   * Denna metoden är detsamma som den innan fast svårare större intervall men lite gissningar
   */
  public static void normalDifficulty() {
	  
	  int rigthAnswer = 1+ ((int)(Math.random() * ((25-1) )));
	  
	  System.out.println("Game has started, you have 10 guesses, Good luck!");
	  
	  
  while( guessCounter<=10) {
	  
	  int guess = doesIntConatin();
		   
			  
		if(guess==rigthAnswer ){
		   System.out.println("Congrats! you guessed the right nummber\nTries:" +guessCounter);
		   anotherRound();
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
  
  
  /**
   * Här är ledtrådarna mindre specifika och intervallet är större fast med mindre gissningar
   */
  public static void hardDifficulty() {
	  
	  int rigthAnswer = 1+ ((int)(Math.random() * ((50-1) )));
	  
	  System.out.println("Game has started, you have 10 guesses, Good luck!");
	  

	  while( guessCounter<=8) {
		  
		  int guess = doesIntConatin();
		   
			  
		if(guess==rigthAnswer ){
		   System.out.println("Congrats! you guessed the right nummber, Tries:" + guessCounter);
		   anotherRound();
		  }
		  
		else if (guess>50) {
			System.out.println("Your guess is outside of the intervall, try again nummbber between 1-50\n");
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
  
  /**
   * den kollar om användarens gissning är en siffra eller bokstav, om det är en bostav så måste spelaren 
   * gissa om.
   * @return den returnar spelarens gissnig så att spelet kan fortsättas med guess
   * annars returnar den text som säger till spelaren att gissa om 
   */
  public static int doesIntConatin() {
	  
   while (true) {
    try {
     guess=diff.nextInt();
    }
    catch (Exception e)
    {
     System.out.print("That’s not a nummber. Try again: ");
     diff.nextLine();
     return doesIntConatin();
    }
    return guess;
   }
  }
  
  /**
   * Denna metoden skickas man till om man antigen vunnit eller fått slut på gissningar,
   *den frågar om du vill kö en til runda då skickas du tillbaka till start annars avslutas 
   *programmet
   */
  public static void anotherRound() {
	  System.out.println("");
	  System.out.println("The game is finished, Do you want to play another round? /n Answer in Yes or No/n");
	   String playAgain=str.nextLine();
	  
	switch(playAgain) {
	  
	  case "yes": startMenu();
	  
	  case "no":System.out.println("Thanks for playing the nummber game");
	        System.exit(0);
	      break;
	  }
  }



}  


  


  
