import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class h�ngaGubbe {

	static Scanner input = new Scanner(System.in);

	private static char storedWord = ' ';

	private static String randomWord;

	private static char playerGuessLetter = ' ';

	private static char[] playerGuess = new char['_'];

	static int amountOfGuesses = 7;

	static int wrongGuessCounter = 0;

	public static boolean wordComplete = false;

	public static boolean wordIsGuessed = false;

	public static void main(String[] args) {

		welcomeToGame();

	}

	/**
	 * Metoden v�lkommnar spelaren
	 */
	public static void welcomeToGame() {

		System.out.println("Welcome to the hang-man game\n");
		System.out.println("In this game the aim is to\n" + "guess the correct word in order to win," + "Good luck!\n");
		System.out.println("Before you can start playing the game, please select the prefered difficulty\n\n");

		chooseDifficulty();
	}

	/**
	 * Denna metodens uppgift �r att ge information kring sv�righetsgraderna och
	 * skicka dig till n�sta metod d�r du g�r valet
	 */

	public static void chooseDifficulty() {

		// skilja �t de tv� olika delarna
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println("Normal: The normal mode gives you shorter and easier words to guess.\n");
		System.out.println("Hard: Hard mode give you both longer and harder words to guess.\n\n\n");
		System.out.println("Please select the prefered difficulty by writing down normal or hard.\n\n\n");
		System.out.println("---------------------------------------------------------------------------------");
		choosenDifficulty();
	}

	/**
	 * Denn metoden kommer att ta din input beroende p� vilken sv�righetsgraddu valt
	 * och sedan skicka dig till den r�tta metoden.
	 */

	public static void choosenDifficulty() {

		String choosenDifficulty = input.nextLine();

		switch (choosenDifficulty) {

		case "normal":
			System.out.println("You have choosen the normal difficulty\n\n");

			normalDifficulty();

			break;

		case "hard":
			System.out.println("You have choosen the hard difficulty");

			// hardDifficulty

			break;
		}

	}

	/**
	 * Denna metoden �r sj�lva seplet f�r normal difficulty, det f�rsta den g�r �r
	 * att h�mta ett ord fr�n en anna metod det den g�r efter �r att den fyller p�
	 * en tom array med _ som kommer att displayas n�r du k�r spelet. sedan kommer
	 * while loopen som k�e till spelaren antigen vinner eller f�r slut p�
	 * gissningar. Det f�rsta som h�nder �r att du skickas till en anna medthod d�r
	 * du g�r gissningen, d�r den kollar att gissnigen �r en bokstav. ifall din
	 * gissning hittas i ordet ers�tts en plats i arrayen som �r fylld med _ med den
	 * bokstav p� platsen i om det villkoret ej uppfylls skickas du till else if och
	 * d�r skickas du sedan vidare till en anna metod som kommer att printa ut den
	 * h�nga gubben beroden p� wrongGuessCountern
	 * 
	 */
	public static void normalDifficulty() {

		randomizedWord();

		for (int i = 0; i < randomWord.length(); i++) {
			playerGuess[i] = '_';
		}

		boolean wordIsGuessed = false;

		while (wrongGuessCounter <= 7 && !wordIsGuessed) {

			System.out.println("Current guesses");

			printArray(playerGuess);

			checkIfContainsIntreger();

			boolean letterGuessed = false;

			for (int i = 0; i < randomWord.length(); i++) {

				if (randomWord.charAt(i) == playerGuessLetter) {

					playerGuess[i] = playerGuessLetter;

					letterGuessed = true;

				}

			}

			if (letterGuessed == false) {

				System.out.println("Wrong!! Try again\n");

				wrongGuessCounter++;

				wrongGuess();
			}

		}

	}

	private static boolean isTheWordGuessed(char[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				;
			return false;

		}
		return true;
	}

	/**
	 * Denn metoden tar in playerGuess arrayen som �r fylld med _ _ _ _ _ och
	 * printar ut den varje gissning
	 * 
	 * @param playerGuess h�r tar jag in playerguess arrayen som �r som sagt fylld
	 *                    med _ _ f�r att g�ra det enklare f�r spelaren att gissa.
	 */

	private static void printArray(char[] playerGuess) {

		for (int i = 0; i < playerGuess.length; i++) {

			System.out.print(playerGuess[i] + " ");
		}

	}

	/**
	 * Denna metoden �r den som slumpar ordet ur en string array f�r normal
	 * difficulty och sedan skickar tillbaka det till huvud metoden f�r spelet. Den
	 * randommizar en siffra som ska motsvara en plats i arrayen och sedan spara den
	 * i en randomWord variabel och skickar tillbaka
	 * 
	 * @return den returnar det slumpade ordet
	 */

	public static String randomizedWord() {

		String[] randomWords = new String[] { "adult", "aware", "bunch", "jumps", "setup" };

		Random randomizer = new Random();

		int randomIndex = randomizer.nextInt(randomWords.length);

		randomWord = randomWords[randomIndex];

		return (randomWord);

	}

	public static char checkIfContainsIntreger() {

		System.out.println("Enter your guess below");

		while (true) {

			String playerGuessWord = input.nextLine();
			
			 isTheWordGuessed(playerGuess);
			 
			 boolean isTheWordGuessed;
			if(isTheWordGuessed = true) {
				 youWon();
			 }

			playerGuessLetter = playerGuessWord.charAt(0);

			if (!Character.isLetter(playerGuessLetter)) {
				System.out.println("Only enter letters!");
			} else if (Character.isLetter(playerGuessLetter)) {

				return (playerGuessLetter);
			}

		}

	}

	/**
	 * Denna metoden kollar igenom metoden som �r fylld med _ sedan innan och ifall
	 * den hittar ett _ s� skickad du tillbaka och forts�tter med spelet. Annars
	 * skickas du tillbaka och
	 * 
	 * @param playerGuess
	 * @return
	 * @return
	 */

	private static void wrongGuess() {

		switch (wrongGuessCounter) {

		case 1:
			System.out.print(" " + "   +---+\n" + "  |   |\n" + "      |\n" + "      |\n" + "      |\n" + "      |\n"
					+ "=========''', '''");
			;
			System.out.println("You now only have 6 guesses left");

			break;

		case 2:
			System.out.print("  " + "   +---+\n" + "  |   |\n" + "  O   |\n" + "      |\n" + "      |\n" + "      |\n"
					+ "=========''', '''");
			System.out.println("You have 5 guesses left!");
			break;

		case 3:
			System.out.print("  " + "   +---+\n" + "  |   |\n" + "  O   |\n" + "  |   |\n" + "      |\n" + "      |\n"
					+ "=========''', '''");
			System.out.println("You have 4 guesses left!!");
			break;

		case 4:
			System.out.print(" " + "   +---+\n" + "  |   |\n" + "  O   |\n" + " /|   |\n" + "      |\n" + "      |\n"
					+ "=========''', '''");
			System.out.println("You have 3 guesses left!!!");
			break;

		case 5:
			System.out.print(" " + "   +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\ |\n" + "      |\n" + "      |\n"
					+ "=========''', '''");
			System.out.println("You have 2 guesses left!!!!");
			break;

		case 6:
			System.out.print(" " + "   +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\ |\n" + " /    |\n" + "      |\n"
					+ "=========''', '''");
			System.out.println("You are on your last guess, choose wisely");
			break;

		case 7:
			System.out.print(" " + "   +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\ |\n" + " / \\ |\n" + "      |\n"
					+ "=========''']");
			System.out.println("You didnt manage to guess the right word:(");
			System.out.println("The  rigth word was:" + " " + randomWord);
			gameEnded();
			break;

		}

	}

	private static void youWon() {
		System.out.println("Congrats you won the game");
		gameEnded();

	}

	public static void gameEnded() {

		System.out.println("The game has now ended");
		System.out.println("Would you like to play another round or exit the game?");

		String playAgain = input.nextLine();

		switch (playAgain) {

		case "yes":
			System.out.println("You have choosen to play another round");

			welcomeToGame();

		case "no":
			System.out.println("Thanks for playing the hangman game");
			System.exit(0);
			break;

		}

	}
}
