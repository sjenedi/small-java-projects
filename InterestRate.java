import java.util.Scanner;

public class InterestRate {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);    
    
    System.out.print("Enter the monthly saving amount: ");
    double amount = input.nextDouble();
    
    
    // Compute interest rate
    double afterFirstMonth =   amount * ( 1 + 0.00417) ;   
    double afterSecondMonth = (amount + afterFirstMonth) * ( 1 + 0.00417);
    double afterThirdMonth =  (amount + afterSecondMonth) * ( 1 + 0.00417);
    double afterFourthMonth = (amount + afterThirdMonth) * ( 1 + 0.00417);
    double afterFifthMonth =  (amount + afterFourthMonth) * ( 1 + 0.00417);
    double afterSixthMonth =  (amount + afterFifthMonth) * ( 1 + 0.00417);

    
    System.out.print("After the 6th months, the account value is $" + (int) afterSixthMonth  );
    
  }

}
