package ex2;

public class Pyramid519 {

	public static void main(String[] args) {
		String s=" 1";
		String s1=" ";
		System.out.printf("%30s\n", s1);
		
		for(int i=1; i<=7; i++) {
		s=((int)Math.pow(2,i))+" "+s;
		s1=s1+" "+((int)Math.pow(2,i));
		System.out.printf("%30s%-30s \n", s1, s);
		}
	}

}
