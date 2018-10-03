/*
 *  @author Sami Jenedi
 */
import java.util.Scanner;

public class DiscountRate {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    final double SALES_TAX_RATE = 0.08;
    double discount1 = 0.10;
    double discount2 = 0.05;
    double totalDiscount = 0.0;
    double enteredPrice;
    double finalPrice = 0.0;
    
    //Get price from user
    System.out.print("Please enter the price of the item:$ "); 
    enteredPrice = input.nextDouble();
    
    if  (enteredPrice > 250)
    {
      totalDiscount = enteredPrice * discount1;
    }
    else if (enteredPrice >= 100 && enteredPrice < 250)
    {
      totalDiscount = enteredPrice * discount2;
    } 
    
    //Add discount amount
    if (enteredPrice >= 100)
       enteredPrice =  enteredPrice - totalDiscount;
    
    //Calculate sales tax and display to user
    finalPrice = enteredPrice * SALES_TAX_RATE + (enteredPrice);

    System.out.print("Final Price:$ " + finalPrice);
  }
}
