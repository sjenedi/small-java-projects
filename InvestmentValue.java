import java.util.Scanner;

public class InvestmentValue {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.print("Please enter investment amount: ");
      double amount = input.nextDouble(); 

      System.out.print("Please enter annual interest rate in percentage: ");
      double interestRate = input.nextDouble(); 
      
      System.out.print("Please enter number of years: ");
      double numOfYears = input.nextDouble(); 
      
      //Compute investment amount
      double value = amount * Math.pow( ( 1 + interestRate / 1200 ), (numOfYears * 12) )  ;
      
      //Display the future investment value
      System.out.print("Accumulated value is $" + value );
  }

}
