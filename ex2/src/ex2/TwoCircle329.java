package ex2;
import java.util.Scanner;

public class TwoCircle329 {

	public static void main(String[] args) {
		System.out.print("Enter r1's center x-, y-coordinates, and radius: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double s1,s2;
		s1 = Math.abs(x1-x2);
		s2 = Math.abs(y1-y2);
		
		if(s1 +r2 <= r1)
			System.out.print("circle2 is inside circle1");
		else if(s1 <= r1)
			System.out.print("circle2 overlaps circle1");
		else
			System.out.print("circle2 does not overlap circle1");
		
		

	}

}
