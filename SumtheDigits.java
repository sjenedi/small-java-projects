import java.util.Scanner;

public class SumtheDigits {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter a number between 0 and 1000: ");    
    int userInput = input.nextInt();
    int sum = 0;
    
    while (userInput >0 )
      {
       sum = userInput % 10 + sum;
       userInput =  userInput / 10;  
      }
     
    System.out.print(sum);
    

  }

}
