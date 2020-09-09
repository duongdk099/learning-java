import java.util.Date;
import java.util.Calendar;
import java.util.Formatter;
public class Flight{

    private int id;
    private String company;

    // Instantiate a Date object
    private Date date = new Date();
    // display formatted date
    //System.out.printf("%s %tB %<te, %<tY", "Due date:", date);

    // creat duration
    private Formatter duration = new Formatter();
    private Calendar cal = Calendar.getInstance();
    duration = new Formatter();
    // display time only
    duration.format("%tl:%tM", cal, cal);

    // class get the Id
    public int getId(){
        return this.id;
    }
    // class to get the Arrival Time
    public getArrivalTime(){
        return ("%s %tB %<te, %<tY", "Due date:", this.date);
    }
    // class to cancel the reservation
    public void cancel()
    {
        System.out.println("Your reservation is canceled");
    }

    /*public static void main(String [] args)
    {

    }*/
}