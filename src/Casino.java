import java.util.Random; 
import java.util.Scanner;

public class Casino {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char userInput;
		int rollCount=1;
		
		
		boolean response = false;
		
		System.out.println("Welcome to Grand Circus Casino!"); 
		System.out.println("How many sides should each die have?");
		int userNum = scnr.nextInt();
		//prompt the user to roll the die
			do {
				System.out.println("Roll " + rollCount);
				rollCount++;
				int dice1 = roll(userNum);
				int dice2 = roll(userNum);
				 
				 System.out.println(dice1);
				 System.out.println(dice2);
					System.out.println("Roll again? (y/n) ");
					userInput = scnr.next().charAt(0);
				 if (userInput == 'y') {
				response = true;	
				}else { response = false;
			System.out.println("Goodbye!");
			}
			}while (response == true);
			scnr.close();
	}
	
			private static int roll(int Num ) {
				Random rand = new Random ();
				return rand.nextInt(Num)+1;
			
	}
}

	

