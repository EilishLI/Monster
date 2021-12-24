package ex2;
import java.util.Scanner;

public class IsItInsideTheCircle322 {

	public static void main(String[] args) {
		System.out.print("Enter a point with two coordinates： ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double d;
		d = Math.sqrt(x*x+y*y);
		if(d <= 10.0)
			System.out.println("Point ("+ x + ", "+ y +") is ins the circle");
		else if (d >10)
			System.out.println("Point ("+ x + ", "+ y +") is not in the circle");
		
		

	}

}
