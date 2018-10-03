import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.print("Please enter the temperature in Fahrenheit between -58 and 41 : ");
      double temperature = input.nextDouble(); 

      System.out.print("Please enter the wind speed (>=2) in miles per hour: ");
      double windSpeed = input.nextDouble(); 
      
      //Compute the wind chill temperature
      double windChill = 35.74 + ( 0.6215 * temperature ) - ( 35.75 * Math.pow( windSpeed , 0.16 ) ) + ( 0.4275 * temperature * Math.pow(windSpeed , 0.16) );
      
      //Display the wind chill temperature
      System.out.print("The wind chill index is:  " + windChill);
  }

}