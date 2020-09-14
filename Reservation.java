import java.util.Date;

public class Reservation {
    private String seat;
    //Creating composition has-a relationship
    private Flight flight;

    //Creating HAS-A relationship with Address class
    Customer customer;
    Personal personal;
    
    
    public Reservation(){
        this.flight = new Flight(); // em chua hieu tai sao o day constructer bi loi
    }
    public String getSeat() {
        return this.seat;
    }
    public Date getArrivalTime() {
        return this.flight.departureTime;
        // em khong dung duoc depart+duration
    }
}
