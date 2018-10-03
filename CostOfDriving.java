import java.util.Scanner;

public class CostOfDriving {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.print("Please enter the driving distance: ");
      double distance = input.nextDouble(); 

      System.out.print("Please enter miles per gallon: ");
      double miles = input.nextDouble(); 
      
      System.out.print("Please enter price per gallon: ");
      double price = input.nextDouble(); 
      
      //Compute investment amount
      double cost = (distance / miles) * price   ;
      
      //Display the future investment value
      System.out.print("The cost of driving is $" + cost );
  }
}