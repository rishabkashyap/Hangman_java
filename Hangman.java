package game;
import java.util.Scanner;
public class Hangman
	{
		String word ="australia";
		public void showMenu()
		{
			int option;
			Scanner sc=new Scanner (System.in);
			System.out.println("------Menu----");
			System.out.println("1. Play");
			System.out.println("2. instruction");
			System.out.println("3. exit");
			System.out.println("\n choose the option:");
			option=sc.nextInt();
		
		switch (option)
		{
			case 1: playGame();
			break;
			case 2: instructGame();
			break;
			case 3: exitGame();
			break;
			default:System.out.println("incorect menu option");
			showMenu();
			break;
		}
	}
		public void playGame()
		{
		int i , flag=0;
		String input,guess;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\nEnter your guess: ");
			input=sc.nextLine();
			for(i=0;i<word.length();i++)
			{
			if(word.charAt(i)==input.charAt(0))
			{
				flag=1;
			}
			}
			if (flag==1)
			{
				System.out.println("letter is present in the word ");
			}
			else
			{
				System.out.println("letter is not present in the word ");
			}
			System.out.println("Do you want to guess again(y/n): ");
			guess=sc.nextLine();
			flag =0;
		}
		while(guess.equals("y")||guess.equals("Y"));
		}
		public void instructGame()
		{
			System.out.println("instruction method is invoked");
		}
		public void exitGame()
		{
			System.out.println("exitGame method is invoked");
			System.exit(0);
		}
		public static void main(String[] args)
		{
		Hangman hg=new Hangman();
		hg.showMenu();
		}
	}