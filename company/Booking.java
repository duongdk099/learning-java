package company;

import java.time.LocalDateTime;

public class Booking {

    private Flight flight; //company.Booking belong to company.Flight
    private String seat;

    public Booking (Flight flight, String seat) {
        this.flight = flight;
        this.seat = seat;
    }

    public Booking(Flight flight) {
        this(flight, "A12");
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    //get flight
    public Flight getFlight(){
        return flight;
    }
    public String getSeat(){
        return this.seat;
    }
    // getArrivalTime
    public LocalDateTime getArrivalTime(){
        return this.flight.getArrivalTime();
    }
}
