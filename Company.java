import company.Booking;
import company.Customer;
import company.Flight;
import company.Personal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {

    private List<Flight> flights;
    private List<Booking> bookings;
    private List<Personal> personals;
    private List<Customer> customers;

    public Company() {
        this.flights = new LinkedList<Flight>();
        this.bookings = new ArrayList<Booking>();
        this.personals = new LinkedList<Personal>();
        this.customers = new LinkedList<Customer>();
    }


    public void createBooking(Booking b) {
        //
        bookings.add(b);
    }

}
