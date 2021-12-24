package ex3;
import java.util.Scanner;

public class PrintDifferentNumbers75 {

	public static void main(String[] args) {
		System.out.print("Enter 10 numbers: ");
		  
		  int[] n=new int[10];
		  int num=0;
		  Scanner input=new Scanner(System.in);
		  for(int i=0;i<10;i++) {
		   int flag=0;
		   int m=input.nextInt();
		   for(int j=0;j<num;j++) {
		    if(n[j]==m) flag=1;
		   }
		   if(flag==0) {
		    n[num]=m;
		    num++;
		   }
		  }
		  
		  System.out.println("The number of distinct number is "+num);
		  System.out.print("The distinct number are:");
		  for(int i=0;i<num;i++) {
		   System.out.print(" "+n[i]);
		  }


	}

}
