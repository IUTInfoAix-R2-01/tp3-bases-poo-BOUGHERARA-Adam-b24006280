
public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account() {
	}
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name,int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int credit(int amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public int debit(int amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
		}else{
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	public int transferTo(Account another,int amount) {
		if(amount <= this.balance) {
			 another.credit(amount);
			 this.debit(amount);
		}else{
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	public String toString() {
		return String.format("Accout[id=%s,name=%s,balance=%d]",this.id,this.name,this.balance);
	}
}
