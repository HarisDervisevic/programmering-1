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
		
   /** Detta �r start menyn som v�kommnar dig in i spelet och du v�ljer �ven vilken sv�righetsgrad 
   * du vill k�ra p� och ger dig anatlet gissningar du f�r och intervallet p� sv�righetsgraden
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
   * Denna metoden kallar p� sv�righetsgraden man valt och h�r valde jag att anv�nda mig av 
   * switch case, som kalla p� den sv�righetsgrad anv�ndraen valt
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
   * Denna metoden �r den som k�r sj�lva spelet fast den enklaste sv�righetsgraden d�r while
   * loopen l�rs till anv�ndaren gissat r�tt. Kallar �ven p� doesIntContain som k�r try catch p�
   * gissningen f�r att se ifall det �r en siffra. N�r man gissat r�tt kommer man till anotherRound
   * metoden som fr�gar om du vill k�ra om igen. H�r �r �ven ledtr�darna mer exakta
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
   * Denna metoden �r detsamma som den innan fast sv�rare st�rre intervall men lite gissningar
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
   * H�r �r ledtr�darna mindre specifika och intervallet �r st�rre fast med mindre gissningar
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
   * den kollar om anv�ndarens gissning �r en siffra eller bokstav, om det �r en bostav s� m�ste spelaren 
   * gissa om.
   * @return den returnar spelarens gissnig s� att spelet kan forts�ttas med guess
   * annars returnar den text som s�ger till spelaren att gissa om 
   */
  public static int doesIntConatin() {
	  
   while (true) {
    try {
     guess=diff.nextInt();
    }
    catch (Exception e)
    {
     System.out.print("That�s not a nummber. Try again: ");
     diff.nextLine();
     return doesIntConatin();
    }
    return guess;
   }
  }
  
  /**
   * Denna metoden skickas man till om man antigen vunnit eller f�tt slut p� gissningar,
   *den fr�gar om du vill k� en til runda d� skickas du tillbaka till start annars avslutas 
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


  


  
