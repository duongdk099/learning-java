package company;

import java.time.Duration;
import java.time.LocalDateTime;
//import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Map;

public class Flight{

    private int id;
    Map<Integer , List<String>> fullFlight;// Hashmap for Flight

    private String departureCity;

    private String arrivalCity;

    private String company;

    private TemporalAmount duration; // mins

    private LocalDateTime departureTime;
    
    private int nbrSeat;
    
    private int price;
    
    public Map<Integer , List<String>> getFullFlight(){
    	return this.fullFlight;
    }
    
    // Constructor the class company.Flight
    public Flight(int id, String departureCity, String arrivalCity ,String nameCompany, 
    		LocalDateTime departureTime, TemporalAmount duration,
    		int nbrSeat, int priceTicket){
        this.id = id;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.company = nameCompany;
        this.departureTime= departureTime;
        this.duration = duration;  
        this.nbrSeat = nbrSeat;
        this.price = priceTicket;
        
    }
    // Get the Flight
    public void getFlight(){
        System.out.println("id : " + this.id
        + "\ndeparture City : " + this.departureCity
        + "\narrival City : " + this.arrivalCity
        + "\ncompany : " + this.company 
        + "\nDeparture time : "+ this.departureTime
        + "\nduration of this trip : " + this.duration
        + "\nthe amount of seat availble : "+ this.nbrSeat
        + "\nthe price of the ticket : "+ this.price);
    }

    // Get the Id
    public int getId(){
        return this.id;
    }

    //Change the city of departure 
    public void changerDepatureCity(String newDepatureCity){
        this.departureCity = newDepatureCity;
    }

    // Change the city of Arrival 
    public  void changerArrivalCity (String newArrivalCity){
        this.arrivalCity = newArrivalCity;
    }
    // change the number of the seat available
    public void changeNbrSeat(int newNbrSeat) {
    	this.nbrSeat = newNbrSeat;
    }
    // change the price of the ticket
    public void changePriceTicket(int newPrice) {
    	this.price = newPrice;
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
                Duration.ofMinutes(30),
                50,
                300);
        
        String crazy_fling_timeing = "2020-06-30T12:30:45";
        
        Flight flight2 = new Flight(2,
        "Singapore",
        "Hanoi", 
        "Freefly", 
        LocalDateTime.parse(crazy_fling_timeing), 
        Duration.ofHours(5),
        100,
        150);
        
        
        System.out.print("First Flight\n");
        flight.getFlight();
        
        
        System.out.print("\nSecond Flight\n");
        flight2.getFlight();

        flight.changerArrivalCity("LA");
        flight.changerDepatureCity("HAN");
        flight.changeNbrSeat(1000);
        flight.changePriceTicket(100);
        
        
        System.out.print("First Flight\n");
        flight.getFlight();
        
        System.out.print("\nSecond Flight\n");
        flight2.getFlight();
    }
}