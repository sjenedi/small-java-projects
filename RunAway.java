
import java.util.Scanner;

public class RunAway {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter speed: ");
    double speed = input.nextDouble(); 

    System.out.print("Please enter accelaration: ");
    double accelaration = input.nextDouble(); 
    
    //Compute the runaway length
    double runAway = Math.pow(speed, 2) / (2 *accelaration);
    
    //Display the runaway length
    System.out.print("Runaway length is : " + runAway);
  }

}
