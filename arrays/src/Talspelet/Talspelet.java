package Talspelet;

import java.util.Scanner;

public class Talspelet {
	
	
	
  public static void main(String[] args) {
	startMenu();
  }
		
  public static void startMenu() {
        
	  Scanner str = new Scanner (System.in);
	  
	  
		System.out.println("Welcome to the Nummber game\n");
		
		System.out.println("Choose difficulty (answer with the corresponding difficulty)\n");
		
		System.out.println("Easy: 9 guesses between 0-12");
		
		System.out.println("Medium: 10 guesses between 0-25");
		
		System.out.println("Hard: 8 guesses between 0-50");
		
		String choosenDifficulty = str.nextLine();
		
		
		
		
		switch(choosenDifficulty) {
		
		case "easy": System.out.println("You have now choosen the easy difficulty ");
		
		//kalla på metoden easy
		break;
		
		case "medium":System.out.println("You haven now choosen the medium difficulty");
		
		//kalla på metoden medium
		break;
		
		case "hard": System.out.println("You have now choosen the hard difficulty");
		
		//kalla på metoden hard
		break;
		
			
		}		
}
  
  public static void easyDifficulty() {
	  
	  
  }
  }
