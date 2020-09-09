
public class Customer extends Person {

	public Customer(String n, int a, String adresse) {
		super(n, a, adresse);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String mail;
	private String password;
	
	public String getMail() {
		return mail;
	}
	
	public void isPasswordCorrect(String p) {
		if (this.password == p)
		{
			System.out.print("Bravo !!!");
		}
		else {
			System.out.print("Sorry");
		}
	}
}
