package ex2;
import java.util.Scanner;

public class TwoRectangle328 {

	public static void main(String[] args) {
		System.out.print("Enter r1's center x-,y-coordinates, width, and height: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		double s1,s2;
		s1 = Math.abs(x1-x2);
		s2 = Math.abs(y1-y2);
		
		if( s2+h2/2.0 <= h1/2.0 && s1+w2/2.0 <= w1/2.0)
			System.out.print("r2 is inside r1");
		else if( s1 <= (w1+w2)/2.0 && s2 <= (h1+h2)/2.0)
			System.out.print("r2 overlaps r1");
		else
			System.out.print("r2 does not overlap r1 ");

	}

}
