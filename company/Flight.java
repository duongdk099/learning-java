package company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;

public class Flight{

    private int id;

    private String departureCity;

    private String arrivalCity;

    private String company;

    private boolean status;

    private TemporalAmount duration; // mins

    private LocalDateTime departureTime;
     
    // Constructor the class company.Flight
    public Flight(int id, String departureCity, String arrivalCity ,String nameCompany, LocalDateTime departureTime, TemporalAmount duration){
        this.id = id;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.company = nameCompany;
        this.departureTime= departureTime;
        this.duration = duration;  
        this.status = true;
    }
    // Get the Flight
    public void getFlight(){
        System.out.println("id : " + this.id
        + "\ndeparture City : " + this.departureCity
        + "\narrival City : " + this.arrivalCity
        + "\ncompany : " + this.company 
        + "\nDeparture time : "+ this.departureTime
        + "\nduration of this trip : " + this.duration);
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

    //Change the city of departure 
    public void changerDepatureCity(String newDepatureCity){
        this.departureCity = newDepatureCity;
    }

    // Change the city of Arrival 
    public  void changerArrivalCity (String newArrivalCity){
        this.arrivalCity = newArrivalCity;
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

        String time_string = "2019-12-31T00:00:00";

        Flight flight = new Flight(1,
                "Paris",
                "Los Angela",
                "Airfrance",
                LocalDateTime.parse(time_string),
                Duration.ofMinutes(30)
                );
        
        String crazy_fling_timeing = "2020-06-30T12:30:45";
        Flight flight2 = new Flight(2,
        "Singapore",
        "Hanoi", 
        "Freefly", 
        LocalDateTime.parse(crazy_fling_timeing), 
        Duration.ofHours(5)
        );
        System.out.print("First Flight\n");
        flight.getFlight();
        System.out.print("\nSecond Flight\n");
        flight2.getFlight();

        flight.changerArrivalCity("LA");
        flight.changerDepatureCity("HAN");
        System.out.print("First Flight\n");
        flight.getFlight();
        System.out.print("\nSecond Flight\n");
        flight2.getFlight();
    }
}