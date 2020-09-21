
public class Personal extends Person {

	public Personal(String n, int a, String adresse) {
		super(n, a, adresse);
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String pseudo;
	private String password;
	private int right;
	private Flight flight; 
	// Personal create Flight
	public void createFlight(Flight newFlight) {
		if (newFlight != null) {
			this.setFl(newFlight);
		}
	}
	public boolean hasRight(int r)
	{
		return r== this.right;
	}
	
	public String getPseudo() {
		return this.pseudo;
	}
	
	public boolean isPasswordCorrect(String p)
	{
		return p == this.password;
	}
	// get Flight
	public Flight getFl() {
		return flight;
	}
	// set Flight
	public void setFl(Flight flight) {
		this.flight = flight;
	}
}
