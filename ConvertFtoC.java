import java.util.Scanner;

public class ConvertFtoC {
  public static void main(String[] args) {
     
   Scanner input = new Scanner(System.in);
  
   
   System.out.print("Enter a degree in Celsuis: ");
   double celsius = input.nextDouble();
   
   double farenheit= (9.0/5) * celsius + 32;
   System.out.print(celsius + " Celsius is " + farenheit + " Farenheit");
  }
}
