package company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer extends Person {

	private String mail;	
	private List<String> bookings;

	// company.Customer can book from booking
	private Booking bk;

	// still sai
	public void book(Booking cusBooking) {
		if(cusBooking != null)  {
			this.bk = cusBooking;
		}
	}
	
	public Customer( String name,  int age,  String adress, int id, String password, String mail, List<String> bookings) {
		super(name, age, adress, id, password);
		this.mail = mail;
		this.bookings = new ArrayList<String>();
	}

	/*public Customer() {
		super("admin", 100, "admin");
		this.bookings = new LinkedList<String>();
	}*/

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
		return 	this.password == p;
	}
	
}
