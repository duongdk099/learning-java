import company.Booking;
import company.Customer;
import company.Flight;
import company.Personal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

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

    public void showFlights(){
        System.out.println(flights);
    }

    public void createFlight(){
        flights.add(12, '1');
    }
    public void changeCity(String newDepature, String newArrival){
        changerDepatureCity(newDepature);
        changerArrivalCity(newArrival);
    }


    public void createBooking(Booking b) {
        //
        bookings.add(b);
    }
    /*
    public void setFlight(int id, String nameCompany, LocalDateTime departureTime, TemporalAmount duration){
        this.id = id;
        this.company = nameCompany;
        this.departureTime= departureTime;
        this.duration = duration;
        this.status = true;
    }
    */



}
