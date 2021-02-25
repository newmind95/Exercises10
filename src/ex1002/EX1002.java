package ex1002;

/**
 *
 * @author kristiyan
 */
public class EX1002 {
    /** Main method. */
    public static void main(String[] args) {
        BMI bmi1 = new BMI("John Smith", 20, 185, 60);
        BMI bmi2 = new BMI("Alex Stone", 195, 83);
        
        System.out.println("The BMI for " + bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus());
        System.out.println("The BMI for " + bmi2.getName() + " is " + 
                bmi2.getBMI() + " " + bmi1.getStatus());
    }
}
