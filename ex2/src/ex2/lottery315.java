package ex2;
import java.util.Scanner;

public class lottery315 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 900 + 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int g = input.nextInt();
		
		int lDigit1 = lottery / 100;
		int lDigit2 = (lottery / 10) % 10;
		int lDigit3 = lottery % 10;
		
		int gDigit1 = g / 100;
		int gDigit2 = g / 10 % 10;
		int gDigit3 = g %10;
		
		System.out.println("The lottery number is "+ lottery);
		
		if (g == lottery)
			System.out.println("Exact match: you win $10,000");
		else if ( lDigit1 == gDigit1 && lDigit2 == gDigit3 && lDigit3 == gDigit2
			    ||lDigit1 == gDigit2 && lDigit2 == gDigit3 && lDigit3 == gDigit1
			    ||lDigit1 == gDigit3 && lDigit2 == gDigit2 && lDigit3 == gDigit1
			    ||lDigit1 == gDigit2 && lDigit2 == gDigit1 && lDigit3 == gDigit3
			    ||lDigit1 == gDigit3 && lDigit2 == gDigit1 && lDigit3 == gDigit2) 
			System.out.println("Exact matvh: you win $3,000");
		else if ( lDigit1 == gDigit1
				||lDigit1 == gDigit2
				||lDigit1 == gDigit3
				||lDigit2 == gDigit1
				||lDigit2 == gDigit2
				||lDigit2 == gDigit3
				||lDigit3 == gDigit1
				||lDigit3 == gDigit2
				||lDigit3 == gDigit3)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry,no match");
	}

}
