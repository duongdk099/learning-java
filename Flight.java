import java.util.Calendar;
public class Flight{

    private int id;
    private String company;
    // Create the full date for the flight
    Calendar flightTime = Calendar.getInstance();
    //flightTime.set(2020, 02, 30, 12, 30, 30);
     
    // Constructor the class Flight
    public Flight(int id, String nameCompany, Calendar dateFlightCalendar ){
        this.id = id;
        this.company = nameCompany;
        this.flightTime= dateFlightCalendar;
    }

    // Get the Id
    public int getId(){
        return this.id;
    }

    // Set the Date
    public Calendar setDateCalendar( Calendar a ){
        return this.flightTime = a;
    }    

    // Cancel the reservation
    public void cancel()
    {
        System.out.println("Your reservation is canceled");
    }

    // get arrival time
    public Calendar getArrival(){
        return this.flightTime;
        // em chua tim duoc cach cong a
    }
}
