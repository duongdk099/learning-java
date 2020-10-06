import company.Booking;
import company.Customer;
import company.Flight;
import company.Personal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

public class Company {

    private List<Flight> flights;
    private List<Booking> bookings;
    private List<Personal> personals;
    private List<Customer> customers;
    

    public Company() {
        this.flights = new LinkedList<Flight>(); // changer à Hash Table
        this.bookings = new ArrayList<Booking>();
        this.personals = new LinkedList<Personal>();
        this.customers = new LinkedList<Customer>();
    }
    // Client: Show list of flight by linked list
    public void showFlights(){
        System.out.println(flights);
    }
    // Client : Pick a flight by ID and then chose how many places they want
    
    // Personal: create a flight
    public Flight createFlight(int idFlight, String departureCity, String arrivalCity ,
    		String nameCompany, LocalDateTime departureTime, TemporalAmount duration,
    		int nbrseat, int tarif){
    	
    	Flight flight = new Flight(idFlight, departureCity, arrivalCity, 
    			nameCompany, departureTime, duration, nbrseat, tarif);
        if(flights.add(flight))
        	return flight;
        else
        	return null;
    }
    // Personal: Change the depart and arrival of the flight by the ID flight
    public void changeCity(int idFlight, String newDepature, String newArrival){
    	for(Flight flight: this.flights)
    		// if(flight.getId() == idFlight)id Create a function that personal can do things by entering the ID Flight
    		if(flight.getId() == idFlight) {
    			flight.changerDepatureCity(newDepature);
    			flight.changerArrivalCity(newArrival);
    		}
    }
    // Personal: Change the amount of the seat of the flight by the ID Flight
    public void changeNbrSeat(int idFlight, int newNbrSeat) {
    	for(Flight flight: this.flights)
    		// if(flight.getId() == idFlight)id Create a function that personal can do things by entering the ID Flight
    		if(flight.getId() == idFlight) {
    			flight.changeNbrSeat(newNbrSeat);
    		}
    }
    // Personal: Change the price of the ticket of the flight by the ID Flight
    public void changePriceTicket(int idFlight, int newPriceTiket) {
    	for(Flight flight: this.flights)
    		// if(flight.getId() == idFlight)id Create a function that personal can do things by entering the ID Flight
    		if(flight.getId() == idFlight) {
    			flight.changePriceTicket(newPriceTiket);
    		}
    }
    
    public void createBooking(Booking b) {
        //
        bookings.add(b);
    }
}
