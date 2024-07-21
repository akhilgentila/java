
import java.util.*;
import java.io.*;


  public class UserMainCode{
    public static int findkey(int input1, int input2, int input3) {
     //  throw new UnsupportedOperationalException("findkey(int input1, int input2, int input3)");
        // Extract the thousands digit of input1
        int thousandsDigit = (input1 / 1000) % 10;

        // Extract the hundreds digit of input2
        int hundredsDigit = (input2 / 100) % 10;

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
        int key = (thousandsDigit * hundredsDigit) + smallestDigit;
        return key;
    }

    public static void main(String[] args) {
        // Test the function with the example inputs
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 5352;
        int key = findkey(input1, input2, input3);
        System.out.println("Key: " + key); // Output should be 13
    }
}
