import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Pictionary {

	public static void main(String[] args) {
		//create scanner for user input
		Scanner input = new Scanner(System.in);
		
		//create player data fields
		int p1 = 0; int p2 = 0; int p3 = 0; int p4 = 0;
		
		//create while loop and boolean to end it for multiple rounds if desired
		boolean run = true;
		while(run){
			//prompt user for input of difficulty
			System.out.println("enter your desired difficulty (1 for easy, 2 for medium, 3 for hard):");
			//store as difficulty value, use integer for difficulty value later for awarding points
			//more points awarded the harder the prompt
			int diff = input.nextInt();
			
			if (diff == 1){
				//prints a random easy word
				String[] EasyWords = {"house","car","bike","pizza","telephone","dog","elephant"};
				Random x = new Random();
				int easy = x.nextInt(EasyWords.length);
				System.out.println("Your word is: ["+EasyWords[easy]+"]");
			}
				else if (diff == 2){
				//prints a random medium word from list
				String[] MediWords = {"father","hair tie","beach","bottlecap","sumo wrestler","teacher"};
				Random x = new Random();
				int medi = x.nextInt(MediWords.length);
				System.out.println("Your word is: ["+ MediWords[medi]+"]");
			}
				else if (diff == 3){
				//prints a random hard word from list
				String[] HardWords = {"president","comet","advil","emotion","egg over easy","addiction" };
				Random x = new Random();
				int hard = x.nextInt(HardWords.length);
				System.out.println("Your word is: ["+HardWords[hard]+"]");
				}
			
			//create a timer for the player's turn
			System.out.println("You have 30 seconds to create your drawing and for another player to guess");
			
			//give time for the drawing
			//shortened to 5 seconds for demonstration purposes
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//end of turn message
			System.out.println("Time is up!");
			
			//see if a player was able to guess
			System.out.println("was there a successful guess?(true or false)");
			//use boolean value to decide whether or not the skip point awarding
			boolean answer = input.nextBoolean();
			
			//create if and else if's to award points to specified players
			//if there was no correct guess in the time limit skip over point awarding
			if (answer == false){
			}
			//award points if guessed correctly
			else if(answer == true){
				System.out.println("Which player's turn is it?(1, 2, 3, 4)");
				//store which player wins
				int winner = input.nextInt();
				if(winner == 1){
					//award points based on difficulty multiplier chosen earlier
					for (int i = 0; i < diff; i++) {
						p1 ++;
					}
				}
					else if(winner == 2){
						for (int i = 0; i < diff; i++) {
							p2 ++;
						}
					}
					else if(winner == 3){
						for (int i = 0; i < diff; i++) {
							p3 ++;
						}
					}
					else if(winner == 4){
						for (int i = 0; i < diff; i++) {
							p4 ++;
						}
					}
				//also award points to the player who made the correct guess
				System.out.println("Which player's made the correct guess?(1, 2, 3, 4)");
				//store which player guessed
				int guesser = input.nextInt();
				if(guesser == 1){
					//award points based on difficulty multiplier chosen earlier
					for (int i = 0; i < diff; i++) {
						p1 ++;
					}
				}
					else if(guesser == 2){
						for (int i = 0; i < diff; i++) {
							p2 ++;
						}
					}
					else if(guesser == 3){
						for (int i = 0; i < diff; i++) {
							p3 ++;
						}
					}
					else if(guesser == 4){
						for (int i = 0; i < diff; i++) {
							p4 ++;
						}
					}

			}
			//display current score at the end of each round
			System.out.println("The current score is:");
			System.out.println("Player 1 has " + p1 + " point(s).");
			System.out.println("Player 2 has " + p2 + " point(s).");
			System.out.println("Player 3 has " + p3 + " point(s).");
			System.out.println("Player 4 has " + p4 + " point(s).");
			
			//allow users to end game by setting run boolean to false
			System.out.println("Would you like to play annother round?(true or false)");
			//if false, while loop discontinues. if true program restarts from while loop
			run = input.nextBoolean();
			
		}
		//display final score
		System.out.println("The final score is: ");
		System.out.println("Player 1 with " + p1 + " point(s).");
		System.out.println("Player 2 with " + p2 + " point(s).");
		System.out.println("Player 3 with " + p3 + " point(s).");
		System.out.println("Player 4 with " + p4 + " point(s).");
	}
}