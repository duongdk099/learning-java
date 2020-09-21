import java.util.Calendar;

public class Booking {
    private Flight fl; //Booking belong to Flight
    private String seat;

    //get flight
    public Flight getFl(){
        return fl;
    }
    public String getSeat(){
        return this.seat;
    }
    // getArrivalTime
    public Calendar getArrivalTime(){
        return this.fl.getArrival();
    }
}
