package ex6;
import java.util.Random;

public class Random94 {

	public static void main(String[] args) {
		Random random = new Random(1000);
		System.out.println("From random :");
		for(int i = 0; i < 50; i++){
			System.out.print(random.nextInt(100) + " ");
		}
	}

}
