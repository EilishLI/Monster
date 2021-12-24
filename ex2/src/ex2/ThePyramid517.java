package ex2;
import java.util.Scanner;

public class ThePyramid517 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数： ");
		
		int n=input.nextInt();
		input.close();
		String s="1";
		String s1 = " ";
		
		System.out.printf("%30s\n",s);
		
		for(int i=2; i<=n; i++) {
			s=i+" "+s;
			s1=s1+i+" ";
			
			System.out.printf("%30s%-30s\n",s,s1);
		}
	}
}
