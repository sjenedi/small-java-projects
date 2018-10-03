/*
 *  @ author Sami Jenedi
 */
import java.util.Scanner;

public class CalculateEnergy {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter the amount of water in kilograms: ");
    double water = input.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double iTemperature = input.nextDouble();

    System.out.print("Enter the final temperature: ");
    double fTemperature = input.nextDouble();
    
    // Compute needed energy
    double energy =  water *( fTemperature - iTemperature ) * 4184;

    // Display needed energy if data is valid
    if  (iTemperature < 0 || fTemperature < 0 || water < 0)
        System.out.print("Invalid data. Please check data entered.");
    
    else
        System.out.print("The energy needed is  " + energy);

  }

}
