import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
// Trying not to just import everything

public class fullmooncalculator {
    public static void main(String[] args) {
        // Design a program that will determine when the next full moon will be based upon the current date.
        Calendar cal = new GregorianCalendar();

        // Set the date to the next full moon
        // September 24th @ 2154 Hours.  Depending on how long it takes, i may do an exact time

        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.MONTH, 8); // -1 from the actual month
        cal.set(Calendar.DAY_OF_MONTH, 24);
        cal.set(Calendar.HOUR_OF_DAY, 21);
        cal.set(Calendar.MINUTE,54);
        // Maybe it didn't take too much to hours and minutes hah.


        Date nextMoon = cal.getTime();
        Date today = new Date();
        long between = nextMoon.getTime() - today.getTime();
        long secbetween = between; // placeholder for seconds.
        between = between / (60L*60L*1000L*24L);

        // i have the code working, now to break it by calculating seconds or something
        long dateSec = (secbetween / 1000 ); // seconds between.. 3600 seconds per hour * 24 hours in a day..then multiply how many days until (it works)
        long dateMil = (int)((cal.getTimeInMillis()+cal.getTimeZone().getOffset(cal.getTimeInMillis()))/1000);

        System.out.println("\nThe next full moon is: "+ nextMoon);
        System.out.println("The Current date is: " + today);
        System.out.println("The next Full moon is in: " + between + " Days");
        System.out.println("That's " + dateSec + " Seconds.");
        System.out.println("That'ss: " + dateMil + " Milliseconds.");






    }
}
