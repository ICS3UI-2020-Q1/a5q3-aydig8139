import java.util.Scanner;

/**
 * factorial calculator
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number and declare a variable to store that number
    System.out.println("Please enter an integer to calculate the factorial of");

    int userNum = input.nextInt();

    int product = 1;

    for(int multiply = userNum; multiply >= 1; multiply--){
      product = product*multiply;
      
    }
    System.out.println(userNum + "! = " + product);
  }
}
