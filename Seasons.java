/*
 *  @ author Sami Jenedi
 *  The user will enter a numeric month, and the program will output the season.
 */

import java.util.Scanner;

public class Seasons {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
      
    System.out.print("Enter a numeric month and I will display the season.\r\n" + 
        "Month: ");
    int month = input.nextInt();
    
    switch(month)
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
