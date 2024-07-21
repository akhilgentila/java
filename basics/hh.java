import java.util.Scanner;
import java.io.*;

public class UserMainCode  {
   

  public static int findKey(int input1, int input2, int input3,input) {
    // Extract the thousands digit of input1
    int thousandsDigit1 = (input1 / 1000) % 10;
int thousandsDigit2 = (input2 / 1000) % 10;
int thousandsDigit3 = (input2 / 1000) % 10;






    // Extract the hundreds digit of input2
   int hundredsDigit1 = (input1/ 100) % 10;
   int hundredsDigit2= (input2 / 100) % 10;
   int hundredsDigit3= (input3/ 100) % 10;
   int tensDigit3= (input3/ 10) % 10;
   int tensDigit2= (input2/ 10) % 10;
   int tensDigit1= (input1/ 10) % 10;
   int unitsDigit1= (input1/ 1) % 10;
   
   


    // Find the smallest digit in input3
    int smallestDigit = Integer.MAX_VALUE;
    int temp = input3;
    while (temp > 0) {
      int digit = temp % 10;
      if (digit < smallestDigit) {
        smallestDigit = digit;
      }
      temp /= 10;
    }

    // Calculate the key
    int key = (thousandsDigit1+thousandsDigit2+thousandsDigit3)*(thousandsDigit2+thousandsDigit1+thousandsDigit3)*(tensDigit1+tensDigit3+tensDigit2);
    return key;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get dynamic input from the user
    System.out.print("Enter input1 (four-digit number): ");
    int input1 = scanner.nextInt();

    System.out.print("Enter input2 (four-digit number): ");
    int input2 = scanner.nextInt();

    System.out.print("Enter input3 (four-digit number): ");
    int input3 = scanner.nextInt();

    // Call the findKey function with dynamic input
    UserMainCode ob=new UserMainCode ();


    int key =ob.findKey(input1, input2, input3);

    System.out.println("Key: " + key);
  }
}