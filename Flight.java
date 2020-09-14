import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Flight{

    private int id;
    private String company;
    // Creat date 
    Date departureTime = new Date();
    // Create time
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

    private Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
     

    public Flight(int id, String nameCompany, Date departTime, Calendar calendarTime ){
        this.id = id;
        this.company = nameCompany;
        this.departureTime= departTime;
        this.calendar = calendarTime;
    }
    // class get the Id
    public int getId(){
        return this.id;
    }
    // class set the Date
    public void setDepartTime(Date DepartTime) {
        this.departureTime = DepartTime;
    }
    // class to cancel the reservation
    public void cancel()
    {
        System.out.println("Your reservation is canceled");
    }

    public Date getArrivalTime() {
        return this.departureTime;
        // em khong biet  time depart + Duration 
    }
}