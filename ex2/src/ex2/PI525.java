package ex2;
import java.util.Scanner;


public class PI525 {

	public static void main(String[] args) {
		double pi = 0.0;
		double[] nums = new double[10]; 
		double molecule = 1.0;
		for(int i = 1; i <= 100000; ++i){
			pi += molecule/(2*i-1);
			molecule = -molecule;
			if(i%10000 == 0){
				nums[(i/10000)-1] = 4*pi;
			}
		}
		
		for(int i = 0; i < 10; ++i)
			System.out.println(nums[i]);
		
	}

}
