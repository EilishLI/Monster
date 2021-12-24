package ex2;
import java.util.Scanner;

public class WhetherThePointIsInTheTriangle327 {

	public static void main(String[] args) {
		System.out.print("Enter a point's x- and y-coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();

		double s;
		s = 0.5 * x + y - 100;
		if(s <=0 )
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
			
	}

}
