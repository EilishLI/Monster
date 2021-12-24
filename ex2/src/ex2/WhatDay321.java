package ex2;
import java.util.Scanner;

public class WhatDay321 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		
		System.out.print("Enter mouth: 1-12: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the mouth: 1-31: ");
		int day = input.nextInt();
		
		if(month ==1 || month == 2 ) {
			month = month + 12;
			year = year - 1;
		}
			
		int j,k,h;
		j = year / 100;
		k = year % 100;
		h = (day + (26 * (month + 1) / 10) + k + k/4 + j/4 + 5 * j) % 7;
		
		if(h == 0)
			System.out.println("day of the week is Saturday");
		else if(h == 1)
			System.out.println("day of the week is Sunday");
		else if(h == 2)
			System.out.println("day of the week is Monday");
		else if(h == 3)
			System.out.println("day of the week is Tuesday");
		else if(h == 4)
			System.out.println("day of the week is Wednesday");
		else if(h == 5)
			System.out.println("day of the week is Thursday");
		else if(h == 6)
			System.out.println("day of the week is Friday");
		
	}

}
