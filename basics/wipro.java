import java.util.Scanner;

public class wipro {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get dynamic input from the user
    System.out.print("Enter input1 (four-digit number): ");
    int input1 = scanner.nextInt();

    System.out.print("Enter input2 (four-digit number): ");
    int input2 = scanner.nextInt();

    System.out.print("Enter input3 (four-digit number): ");
    int input3 = scanner.nextInt();
    System.out.print("Enter input3 (): ");
    int input4 = scanner.nextInt();


    // Call the findKey function with dynamic input
    UserMainCode ob=new UserMainCode() ;


    int key =ob.findKey(input1, input2, input3,input4);

    System.out.println("Key: " + key);
    
   } 
   public static int findKey(int input1, int input2, int input3,int input4) {

    int smallestDigit = Integer.MAX_VALUE;
    int temp = input1;
    while (temp > 0) {
      int digit1 = temp % 10;
      if (digit1 < smallestDigit) {
        smallestDigit = digit1;
      }
      temp /= 10;
    }
    System.out.println("input 1"+smallestDigit);

    int smallestDigit3 = Integer.MAX_VALUE;
    int temp3 = input3;
    while (temp3 > 0) {
      int digit = temp3 % 10;
      if (digit < smallestDigit3) {
        smallestDigit3 = digit;
      }
      temp3 /= 10;
    }
    System.out.println("input 3"+smallestDigit3);
    int largestDigit = Integer.MIN_VALUE;
    int temp1= input2;
    while (temp1 > 0) {
        int digit2 = temp1 % 10;
        if (digit2 > largestDigit) {
            largestDigit = digit2;
        }
        temp1 /= 10;
   
    }
    System.out.println("input2"+largestDigit);

    int key=((smallestDigit)*(largestDigit)*(smallestDigit3))-input4;
    return Math.min(largestDigit, key);
}
}