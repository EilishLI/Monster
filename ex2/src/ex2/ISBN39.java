package ex2;
import java.util.Scanner;

public class ISBN39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String str = input.next();
		int ans = 0;
		for(int i = 0;i<9;i++) {
			ans += (int)(str.charAt(i)-'0') * (i+1);
		}
		int d10 = ans % 11;
		if(d10==10) {
			System.out.println("The ISBN-10 number is " +str+"X");
		}else {
			System.out.println("The ISBN-10 number is " +str+d10);
		}
	}

}
