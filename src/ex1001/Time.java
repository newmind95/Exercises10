package ex1001;

/**
-second: long
-minute: long
-hour: long
---------------------------------------------
+Time()
+Time(elapsed: long)
+Time(second: long, minute: long, hour: long)
+getSecond(): long
+getMinute(): long
+getHour(): long
+setTime(elapsed: long)

 */

/**
 *
 * @author kristiyan
 */
public class Time {
    private long second;
    private long minute;
    private long hour;
    
    /** Default constructor that creates a Time object for the current time. */
    public Time() {
        this(0);
    }
    
    /** Constructor that construct a Time object. */
    public Time(long elapsed) {
        setTime(elapsed);
    }
    
    /** A constructor that construct a Time object 
     * with the specified hour, minute and second.
     */
    public Time(long second, long minute, long hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    
    /** Return current second. */
    public long getSecond() {
        return second;
    }
    
    /** Return current minute. */
    public long getMinute() {
        return minute;
    }
    
    /** Return current hour. */
    public long getHour() {
        return hour;
    }
    
    /** Method that sets a new time
     * for the object using the elapsed time.
     */
    public void setTime(long elapsed) {
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total seconds since midnight, Jan, 1, 1970.
        long totalSeconds = totalMilliseconds / 1000;
        // Compute the current second in the minute in the hour
        second = totalSeconds % 60;
        
        // Obtain the total minutes.
        long totalMinutes = totalSeconds / 60;
        // Compute the current minute in the hour.
        minute = totalMinutes % 60;
        
        // Obtain the total hours.
        long totalHours = totalMinutes / 60;
        // Compute the current hour.
        hour = totalHours % 24;
        
        if (elapsed > 0) {
             totalSeconds = totalMilliseconds / 1000;
             second = totalSeconds % 60;
             totalMinutes = totalSeconds / 60;
             minute = totalMinutes % 60;
             totalHours = totalMinutes / 60;
             hour = totalHours % 24;
        }
    }
}
