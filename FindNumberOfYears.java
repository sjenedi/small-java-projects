import java.util.Scanner;

public class FindNumberOfYears {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of minutes: ");    
    int minutes = input.nextInt();
    
    int day = minutes / 60 / 24;
    int year =  day / 365 ;
    int remainingYear = day %  365;
    
    System.out.print(minutes + " minutes is approximately "+ year + " years and " + remainingYear + " days");    

    
  }

}
