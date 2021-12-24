package ex2;
import java.util.Scanner;

public class TrianglePerimeter319 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int s;
		
		s = a + b + c;
		
		if(a + b > c && a + c > b && b + c > a)
			System.out.println("The perimeter of a triangle is equal to " + s);
		else
			System.out.println("Invalid");
			
	}

}