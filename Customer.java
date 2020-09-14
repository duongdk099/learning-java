import java.util.ArrayList;

public class Customer extends Person {

	private static String addresse;
	private int id;
	private String mail;
	private String password;
	private ArrayList<String> bookings = new ArrayList<String>();

	public Customer( String name,  int age,  String address) {
		super(name, age, addresse);
		this.bookings = new ArrayList<String>();
	}

	public Customer() {
		super("admin", 100, "admin");
		this.bookings = new ArrayList<String>();
	}

	public String getMail() {
		return mail;
	}

	private boolean isMaxBooking() {
		return ((CharSequence) this.bookings).length() >= 5;
	}

	public void addBooking(String booking) {
		if(!this.isMaxBooking()) {
			this.bookings.add(booking);
			System.out.println("Bravo!!!"); //success
		}
		System.out.println("Again, plz");;
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
