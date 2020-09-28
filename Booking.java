import java.time.LocalDateTime;
import java.util.Calendar;

public class Booking {

    private Flight flight; //Booking belong to Flight
    private String seat;

    public Booking (Flight flight, String seat) {
        this.flight = flight;
        this.seat = seat;
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
