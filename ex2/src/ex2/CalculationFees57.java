package ex2;

public class CalculationFees57 {

	public static void main(String[] args) {
		double fees =10000;
		int year = 1;
		
		while(year <=10) {
			year++;
			fees = fees * 1.05;
			
		}
		System.out.println("fees for 10 years last is "+ fees);
		
		while(year<=14) {
			year++;
			fees += fees * 1.05;
		}
		System.out.print("The fees for four years after 10 years is " + fees);
	}

}
