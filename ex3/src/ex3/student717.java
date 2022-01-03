package ex3;
import java.util.Scanner;

public class student717 {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		String[] names = new String[n];
		double[] grades = new double[n];
		
		for(int i = 0; i < n; ++i){
			names[i] = cin.next();
			grades[i] = cin.nextDouble();
		}
		
		for(int i = 0; i < n-1; ++i){
			for(int j = i+1; j < n; ++j){
				if(grades[i] < grades[j]){
					double temp = grades[i];
					grades[i] = grades[j];
					grades[j] = temp;
					
					String tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < n; ++i){
			System.out.println(names[i] + "    " + grades[i]);
		}
	}
}
