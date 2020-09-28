package company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

public class Flight{

    private int id;

    private String company;

    private boolean status;

    private TemporalAmount duration; // mins

    private LocalDateTime departureTime;
     
    // Constructor the class company.Flight
    public Flight(int id, String nameCompany, LocalDateTime departureTime, TemporalAmount duration){
        this.id = id;
        this.company = nameCompany;
        this.departureTime= departureTime;
        this.duration = duration;
        this.status = true;
    }

    // Get the Id
    public int getId(){
        return this.id;
    }

    // Cancel the reservation
    public void cancel()
    {
        status = false;
    }

    /**
     * get arrival time, a copy instance of time
     * arrival = departure + duration
     * @return LocalDateTime
     */
    public LocalDateTime getArrivalTime(){
        return this.departureTime.plus(this.duration);
    }

    public static void main(String[] args) {

        String time_string = "2019-12-31T19:15:30";

        Flight flight = new Flight(1,
                "Airfrance",
                LocalDateTime.parse(time_string),
                Duration.ofHours(3));

        System.out.println(flight);
    }

}
