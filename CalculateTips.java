import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter the subtotal and a gratuity rate: ");    
    double subtotal = input.nextDouble();
    double gratuity = input.nextDouble();
    
    gratuity =  subtotal * (gratuity * 0.01);

    
    System.out.print("The gratuity is $" + gratuity + " and total is $" + (gratuity +  subtotal) );

  }

}
