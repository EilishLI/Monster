package ex2;
import java.util.Scanner;

public class CompareLoansAtDifferentInterestRates521 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Account:");
		double account = input.nextDouble();
		System.out.print("Number of Years:");
		int year = input.nextInt();
		System.out.println("Interests Rate        Monthly Payment        Total Payment");
		double srate = 0.05;
		double mrate = 0.05/12;
		double erate = 0.08;
		double increase = 0.01/8.0;
		int acc = 0;
		while(true){
			++acc;
			double monthlyPayment = (account*mrate)/(1-1/Math.pow(1+mrate, year*12));
			double totalPayment = monthlyPayment*12.0*year;
			System.out.printf("%.3f%%                %.2f                 %.2f\n",srate*100,monthlyPayment,totalPayment);
			srate += increase;
			mrate = srate/12;
			if(acc == 25)
				break;
		}

	}

}
