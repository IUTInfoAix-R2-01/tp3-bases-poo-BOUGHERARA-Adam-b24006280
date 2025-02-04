public class Livre {
	private String name;
	private float price;
	private int quantite;
	
	public Livre(String name, float price,int quantite) {
		this.name = name;
		this.price = price;
		this.quantite = quantite;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public int getQuantite() {
		return this.quantite;
	}
	
	public String toString() {
		return String.format("Livre[name=%s,price=%.2f,quantité=%d]", this.name,this.price,this.quantite);
	}
}