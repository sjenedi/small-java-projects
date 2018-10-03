import java.util.Scanner;

public class java {

  
  static int randomNumber;
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
   
    System.out.print(getRandomNum());
    
    int guessResult = 1;
    int randomGuess = 0;
    
    while(guessResult != -1)
    {
      System.out.print(", Guess a number between 1 and 50: ");
      randomGuess = input.nextInt();
      guessResult = checkGuess(randomGuess);
    }
    System.out.print("Yes the random number is " + randomGuess);

  }
  
  public static int getRandomNum() 
  {

   randomNumber = (int) (Math.random() * 51);
   return randomNumber;
   
   
  }
  
  public static int checkGuess(int guess)
  {
    if (guess == randomNumber)
    {
      return -1;
    }
    else
    {
      return guess;
    }
  }
}
