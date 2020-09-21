
public class Personal extends Person {

	public Personal(String n, int a, String adresse) {
		super(n, a, adresse);
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String pseudo;
	private String password;
	private int right;
	private Flight fl; 
	// Personal create Flight
	public void createFlight(Flight newFlight) {
		if (newFlight != null) {
			this.setFl(newFlight);
		}
	}
	public boolean hasRight(int r)
	{
		if (r == this.right)
		return true;
		return false;
	}
	
	public String getPseudo() {
		return this.pseudo;
	}
	
	public boolean isPasswordCorrect(String p)
	{
		if(p == this.password)
		return true;
		return false;
	}
	// get Flight
	public Flight getFl() {
		return fl;
	}
	// set Flight
	public void setFl(Flight fl) {
		this.fl = fl;
	}
}
