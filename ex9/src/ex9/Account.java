package ex9;
import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name;
	private int id;
	private double balance;
	private ArrayList<Trst> trst=new ArrayList<>();
	public Account(String name,int id, double balance) {
		this.name=name;
		this.id=id;
		this.balance=balance;
	}
	public void withDraw(double k) {
		Date time=new Date();
		Trst now=new Trst(time,'w',k,this.balance-k,"draw money");
		this.balance-=k;
		trst.add(now);
	}
	
	public void deposit(double k) {
		Date time=new Date();
		Trst now=new Trst(time,'d',k,this.balance+k,"deposit money");
		this.balance+=k;
		trst.add(now);
	}
	
	public void print() {
		for(int i =0;i<trst.size();i++) {
			trst.get(i).print();
		}
		System.out.println(name+" now have "+balance+" dollar.");
	}
	public static void main(String[] args) {
		Account Ljj= new Account("George",1122,1000);
		Ljj.deposit(30);
		Ljj.deposit(40);
		Ljj.deposit(50);
		
		Ljj.withDraw(5);
		Ljj.withDraw(4);
		Ljj.withDraw(2);
		
		Ljj.print();
	}
}

