/*
 *  @ author Sami Jenedi
 *  This class finds average acceleration 
 */
import java.util.Scanner;

public class Acceleration {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter starting velocity in meters / second: ");
    double v0 = input.nextDouble();

    System.out.print("Enter ending velocity in meters / second: ");
    double v1 = input.nextDouble();

    System.out.print("Enter the time in seconds: ");
    double time = input.nextDouble();
    
    // Compute acceleration
    double acceleration = (v1 - v0) / time;

    // Display average acceleration if data is valid
    if  (v0 < 0 || v1 < 0 || time < 0)
        System.out.print("Invalid data. Please check data entered.");
    
    else
        System.out.print("The average acceleration is  " + acceleration + " meters / second.");

  }

}
