package banking;

public class Customer {
	String name;
	String addresse;
	
	
	public Customer(String name) {
		this.name = name;
	}
	
	
	public void setAddresse(String addr) {
		this.addresse = addr;
	}
	
	public String getName() {
		return name;
		
	}
	
	
	public String getAddresee() {
		return addresse;
	}
}
