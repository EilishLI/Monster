package ex9;

import java.util.Date;

public class Trst {
	private Date time = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Trst(Date time, char type, double amount, double balance,String des) {
		this.time=time;
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this. description=des;

	}
	
	public void print() {
		System.out.println("type: "+type+" "+description+amount+" in "+time.toString()+" and now have "+balance);
	}
}
