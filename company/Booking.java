package company;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Booking {

    private Flight flight; //company.Booking belong to company.Flight
    private int nbrSeat;
    private boolean status;
    Map<Flight> flights;
    public Booking (Flight flight, int nbrSeat) {
        this.flight = flight;
        this.nbrSeat = nbrSeat;
        this.status = true;
    }

    public Booking(Flight flight) {
        this(flight, 0);
    }
    // Pick The Flight by ID and then enter the number of Seat he wants to buys
    /*public int BookFlightById(int idFlight, int nbrSeatBuy) {
    	if(flight.getId() == idFlight) {
    		
    		for( Integer f: flight.fullFlight.keySet() ) {
    			flight.fullFlight.con
    		}
    		//
    	}
    }*/
    
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    //get flight
    public Flight getFlight(){
        return flight;
    }
    //get the total of seat
    public int getNbrSeat(){
        return this.nbrSeat;
    }
    // Take an amount of seat
    public void takeSeat(int nbrSeatBuy) {
    	this.nbrSeat -= nbrSeatBuy;
    }
    // getArrivalTime
    public LocalDateTime getArrivalTime(){
        return this.flight.getArrivalTime();
    }
    
    public void cancel() {
    	status = false;
    	System.out.print("You have canceled the booking!!");
    }
}
