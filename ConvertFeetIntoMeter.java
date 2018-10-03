import java.util.Scanner;

public class ConvertFeetIntoMeter {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter a value for feet: ");
    
    double feet = input.nextDouble();
    
    double meter=  feet * 0.305;

    
    System.out.print(feet + " Feet is " + " "  + meter + " Meters");

  }

}
