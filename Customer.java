import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer extends Person {

	private static String addresse;
	private int id;
	private String mail;
	private String password;
	private List<String> bookings;
	// Customer can book from booking
	private Booking bk;
	// still sai
	public void book(Booking cusBooking) {
		if(cusBooking != null)
		{
			this.bk = cusBooking;
		}
	}
	
	public Customer( String name,  int age,  String address) {
		super(name, age, addresse);
		this.bookings = new ArrayList<String>();
	}

	public Customer() {
		super("admin", 100, "admin");
		this.bookings = new LinkedList<String>();
	}

	public String getMail() {
		return mail;
	}

	private boolean isMaxBooking() {
		
		return this.bookings.size() >= 5;
	}

	public boolean addBooking(String booking) {
		if(!this.isMaxBooking()) {
			this.bookings.add(booking);
			return true; //success
		}
		return false;
	}

	public boolean isPasswordCorrect(String p) {
		if (this.password == p)
			return true;
			return false;
	}

	//set Flight
	
}
