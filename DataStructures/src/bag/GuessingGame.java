package bag;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	private LinkedBag <Integer> user = new LinkedBag<Integer>();
	private LinkedBag <Integer> game = new LinkedBag<Integer>();
	private int size;
	
	public GuessingGame(int size, int range) {
		initializeGame(size, range);
	}

	public static void main(String[] args) {
		System.out.printf("In this game you select a number of integers to guess\r\n"
				+ "and their range (2 to whatever you select)\r\n"
				+ "The system generates this number of random integers. They are not necessarily distinct\r\n"
				+ "You will try to guess them in several attempts \r\n");
		Scanner input = new Scanner(System.in);
		boolean playAgain = false;
		
		do {
			System.out.printf("How many numbers do you want to guess? ");
			int size = input.nextInt();
			System.out.printf("Specify the range : 1 to (your choice) ");
			int range = input.nextInt();
			GuessingGame g = new GuessingGame(size, range);
			play(g, input);
			boolean answered = false;
			System.out.printf("Do you want to play again(Y/N)? ");
			do{	
				String x = input.next();
				if(x.equals("Y")) {
					playAgain = true;
					answered = true;
				}
				else if(x.equals("N")) {
					playAgain = false;
					answered = true;
				}
				else {
					System.out.printf("Please answer Y/N: ");
				}
			}while(answered == false);
		}while(playAgain == true);
		

	}
	
	@SuppressWarnings("static-access")
	public void initializeGame(int size, int range) {
		this.size = size;
		Random rand = new Random();
		for(int i = 0; i < size; i++) {
			Integer j = rand.nextInt(range) + 1;
			game.add(j);
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public void addFromUser(Integer value) {
		user.add(value);
	}
	
	public int numIntersection() {
		int intersection = 0;
		Object[] guess = user.toArray();
		Object[] answer = game.toArray();
		for(int i = 0; i < user.getCurrentSize(); i++) {
			for(int j = 0; j < game.getCurrentSize(); j++) {
				if(guess[i].equals(answer[j])) {
					intersection++;
				}
			}
		}
		
		return intersection;
	}
	
	public void clearUser() {
		user.clear();
	}
	
	public static void play(GuessingGame g, Scanner input) {
		boolean wrong = true;
		while(wrong == true) {
			System.out.printf("Please enter %d guess(es)", g.getSize());
			for(int i = 0; i < g.getSize(); i++) {
				g.addFromUser(input.nextInt());
			}
			int numCorrect = g.numIntersection();
			if(numCorrect == g.getSize()) {
				System.out.println("You won!");
				wrong = false;
			}
			else {
				g.clearUser();
			}
		}
		return;
	}

}
