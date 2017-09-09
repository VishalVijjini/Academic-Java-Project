
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
public class DateAndTime {
    
    //a format string for the date and time
    public static final String Date_Format = "MMM-dd-yyyy HH:mm:ss";
    public static String dt;
    
    //get the time and date now
    public static String DateTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(Date_Format);
        return sdf.format(cal.getTime());
    }
}
