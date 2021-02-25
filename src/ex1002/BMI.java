package ex1002;

/**
 *
 * @author kristiyan
 */
public class BMI {
    private String name;
    private int age;
    private double weight;     // in pounds.
    private double height;      // in inches.
    private double feet;
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.254;
    private static final double INCH_PER_FOOT = 12;
    
    /** Construct a BMI with the specified name,
     *  age, weight, and height.
     * 
     * @param name that holds the name.
     * @param age that holds the age.
     * @param weight that holds the weight.
     * @param height that holds the height.
     */
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    /** Construct a BMI with the specified name,
     *  age, weight, height, feet, and inches.
     * 
     * @param name that holds the name.
     * @param age that holds the age.
     * @param weight that holds the weight.
     * @param feet that holds the feet.
     * @param inches that holds the inches.
     */
    public BMI(String name, int age, double weight, double feet,
            double inches) {
        this(name, age, weight, inches + feet * 12);
    }
    
    /** Construct a BMI with the specified name,
     *  weight, and height
     * @param name that holds the name.
     * @param weight that holds the weight.
     * @param height  that holds the height.
     */
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    
    /** Return BMI. */
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
    
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    /** Return specified age. */
    public int getAge() {
        return age;
    }
    
    /** Return specified name. */
    public String getName() {
        return name;
    }
    
    /** Return specified weight. */
    public double getWeight() {
        return weight;
    }
    
    /** Return specified height. */
    public double getHeight() {
        return height;
    }
}