import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hängaGubbe {

	static Scanner input = new Scanner(System.in);

	private static String randomWordNormal;
	
	private static String randomWordHard;

	private static char playerGuessLetter = ' ';

	private static char[] underScoreArray = new char['_'];

	static int amountOfGuesses = 7;

	static int wrongGuessCounter = 0;

	public static boolean wordComplete = false;

	public static boolean wordIsGuessed = false;

	public static void main(String[] args) {

		welcomeToGame();

	}

	/**
	 * Metoden välkommnar spelaren
	 */
	public static void welcomeToGame() {

		System.out.println("Welcome to the hang-man game\n");
		System.out.println("In this game the aim is to\n" + "guess the correct word in order to win," + "Good luck!\n");
		System.out.println("Before you can start playing the game, please select the prefered difficulty\n\n");

		chooseDifficulty();
	}

	/**
	 * Denna metodens uppgift är att ge information kring svårighetsgraderna och
	 * skicka dig till nästa metod där du gör valet
	 */

	public static void chooseDifficulty() {

		// skilja åt de två olika delarna
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println("Normal: The normal mode gives you shorter and easier words to guess.\n");
		System.out.println("Hard: Hard mode gives you harder words to guess.\n\n\n");
		System.out.println("Please select the prefered difficulty by writing down normal or hard.\n\n\n");
		System.out.println("---------------------------------------------------------------------------------");
		choosenDifficulty();
	}

	/**
	 * Denn metoden kommer att ta din input beroende på vilken svårighetsgraddu valt
	 * och sedan skicka dig till den rätta metoden.
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

			hardDifficulty();
			break;
		}

	}

	/**
	 * Denna metoden är själva seplet för normal difficulty, det första den gör är
	 * att hämta ett ord från en anna metod det den gör efter är att den fyller på
	 * en tom array med _ som kommer att displayas när du kör spelet. sedan kommer
	 * while loopen som köe till spelaren antigen vinner eller får slut på
	 * gissningar. Det första som händer är att du skickas till en anna medthod där
	 * du gör gissningen, där den kollar att gissnigen är en bokstav. ifall din
	 * gissning hittas i ordet ersätts en plats i arrayen som är fylld med _ med den
	 * bokstav på platsen i om det villkoret ej uppfylls skickas du till else if och
	 * där skickas du sedan vidare till en anna metod som kommer att printa ut den
	 * hänga gubben beroden på wrongGuessCountern
	 * 
	 */
	public static void normalDifficulty() {

		randomizedWordNormal();

		for (int i = 0; i < randomWordNormal.length(); i++) {
			underScoreArray[i] = '_';
		}

		boolean wordIsGuessed = false;

		while (wrongGuessCounter <= 7 && !wordIsGuessed) {

			System.out.println("Current guesses");

			printArray(underScoreArray);

			checkIfContainsIntreger();

			boolean letterGuessed = false;

			for (int i = 0; i < randomWordNormal.length(); i++) {

				if (randomWordNormal.charAt(i) == playerGuessLetter) {

					underScoreArray[i] = playerGuessLetter;

					letterGuessed = true;

				}

			}

			String test = new String(underScoreArray);

			if (test.trim().equals(randomWordNormal)) {

				wordIsGuessed = true;

				youWon();
			}

			System.out.println(wordIsGuessed);

			if (letterGuessed == false) {

				System.out.println("Wrong!! Try again\n");

				wrongGuessCounter++;

				wrongGuess();
			}

		}

	}
	/**
	 * Samma som tidigare metod normalDifficulty fast med andra variabler och andra slumpade
	 * ord.
	 */
	
	public static void hardDifficulty() {

		randomizedWordHard();

		for (int i = 0; i < randomWordHard.length(); i++) {
			underScoreArray[i] = '_';
		}

		boolean wordIsGuessed = false;

		while (wrongGuessCounter <= 7 && !wordIsGuessed) {

			System.out.println("Current guesses");

			printArray(underScoreArray);

			checkIfContainsIntreger();

			boolean letterGuessed = false;

			for (int i = 0; i < randomWordHard.length(); i++) {

				if (randomWordHard.charAt(i) == playerGuessLetter) {

					underScoreArray[i] = playerGuessLetter;

					letterGuessed = true;
					
					System.out.println("Correct!");

				}

			}

			String test = new String(underScoreArray);

			if (test.trim().equals(randomWordHard)) {

				wordIsGuessed = true;

				youWon();
			}


			if (letterGuessed == false) {

				System.out.println("Wrong!! Try again\n");

				wrongGuessCounter++;

				wrongGuess();
			}

		}

	}

	/**
	 * Denn metoden tar in playerGuess arrayen som är fylld med _ _ _ _ _ och
	 * printar ut den varje gissning
	 * 
	 * @param playerGuess här tar jag in underScoreArray arrayen som är som sagt
	 *                    fylld med _ _ för att göra det enklare för spelaren att
	 *                    gissa.
	 */

	private static void printArray(char[] underScoreArray) {

		for (int i = 0; i < underScoreArray.length; i++) {

			System.out.print(underScoreArray[i] + " ");
		}
		System.out.println();

	}

	/**
	 * Denna metoden är den som slumpar ordet ur en string array för normal
	 * difficulty och sedan skickar tillbaka det till huvud metoden för spelet. Den
	 * randommizar en siffra som ska motsvara en plats i arrayen och sedan spara den
	 * i en randomWord variabel och skickar tillbaka
	 * 
	 * @return den returnar det slumpade ordet
	 */

	public static String randomizedWordNormal() {

		String[] randomWords = new String[] { "adult", "aware", "bunch", "jumps", "setup" };

		Random randomizerNormal = new Random();

		int randomIndex = randomizerNormal.nextInt(randomWords.length);

		randomWordNormal = randomWords[randomIndex];

		return (randomWordNormal);

	}
	/**
	 * Samma som randomizedWordNormal fast med andra ord.
	 * @return
	 */
	
	public static String randomizedWordHard() {

		String[] randomWords = new String[] { "shops", "teeth", "which", "mocking", "urban" };

		Random randomizerHard = new Random();

		int randomIndex = randomizerHard.nextInt(randomWords.length);

		randomWordHard = randomWords[randomIndex];

		return (randomWordHard);

	}

	/**
	 * Denna array gör din gissning och sedan kolllar ifall den är en boksatv med
	 * isLetter ifall den inte är det får du ett error meddelande, annars skickas du
	 * tillbaka till huvud metoden och spelet fortsätter. Ifall du gissar på ett ord
	 * kommer den ta den första bokstaven bara eftersom jag satte charAt till 0 så
	 * att den tar bara den första boskatven som input.
	 * 
	 * @return din gissning som ska vara en bokstav
	 */

	public static char checkIfContainsIntreger() {


		while (true) {

			String playerGuessWord = input.nextLine();

			playerGuessLetter = playerGuessWord.charAt(0);

			if (!Character.isLetter(playerGuessLetter)) {

				System.out.println("Only enter letters please!");

			} else if (Character.isLetter(playerGuessLetter)) {

				return (playerGuessLetter);
			}

		}

	}

	/**
	 * till denna metod kommer du ifall di gissat fel och med hjälp av
	 * wrongGuessCounter kommer den displaya rätt hängd gubbe beroende på hur många
	 * fel gissningar du har gjort och sedan skickas tillbaka till huvudspelet
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
			gameEnded();
			break;

		}

	}
	
	/**
	 * Om du vunnit får du ett meddelande att du har och tar dig till slutmetoden
	 */

	private static void youWon() {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Congrats you won the game\n");
		gameEnded();

	}
	/**
	 * The game has ended,om du har antigen gissta på ordet eller fått slut på gisssningar kommer 
	 * du hit och får välja ifall du vill köra igen eller inte.
	 */

	public static void gameEnded() {

		System.out.println("The game has now ended\n");
		System.out.println("Would you like to play another round or exit the game?" + "yes or no");

		String playAgain = input.nextLine();

		switch (playAgain) {

		case "yes":
			System.out.println("You have choosen to play another round\n\n\n");

			welcomeToGame();

		case "no":
			System.out.println("Thanks for playing the hangman game");
			System.exit(0);
			break;

		}

	}
}
