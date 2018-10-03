import java.util.Scanner;

public class RandomMonth {

  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
    int number1 = 1 +  (int) (Math.random() * 12);

      
        switch(number1)
        {
           case 12:
           case 1:
           case 2:
       System.out.println("Winter");
           break;
           case 3:
           case 4:
           case 5:
       System.out.println("Spring");
           break;
           case 6:
           case 7:
           case 8:
       System.out.println("Summer");
           break;
           case 9:
           case 10:
           case 11:
       System.out.println("Spring");
           break;
           default:
       System.out.println("I'm sorry, an invalid month was entered.");
         }

  }

}
