package company;

public class Personal extends Person {

	

	private String pseudo;
	private int right;
	private Flight flight; 
	// company.Personal create company.Flight



	public Personnal(String name, int age, String adress, int id, String password, String pseudo, int right, Flight flight) {
		super(name, age, adress, id, password);
		this.pseudo = pseudo;
		this.right = right;
		this.flight = flight;
	}

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
	// get company.Flight
	public Flight getFlight() {
		return flight;
	}
	// set company.Flight
	public void setFl(Flight flight) {
		this.flight = flight;
	}
}
