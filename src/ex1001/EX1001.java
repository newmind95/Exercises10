package ex1001;

/**
 *
 * @author kristiyan
 */
public class EX1001 {
    /** Main method. */
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println("Current time is: " + time1.getHour() + 
                ":" + time1.getMinute() + ":" + time1.getSecond() + " GTM");
        System.out.println("Current time is: " + time2.getHour() + 
                ":" + time2.getMinute() + ":" + time2.getSecond() + " GTM");
    }
}
