import java.util.Calendar;

public class Booking {
    private Flight flight; //Booking belong to Flight
    private String seat;

    //get flight
    public Flight getFlight(){
        return flight;
    }
    public String getSeat(){
        return this.seat;
    }
    // getArrivalTime
    public Calendar getArrivalTime(){
        return this.flight.getArrival();
    }
}
