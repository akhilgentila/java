public class ff{
    public static void main(String[] args){
     /*    int input2=3542;
        int largestDigit = Integer.MIN_VALUE;
    int temp1= input2;
    while (temp1 > 0) {
        int digit2 = temp1 % 10;
        if (digit2 > largestDigit) {
            largestDigit = digit2;
        }
        temp1/= 10;
   
    } */
    int input1=26564;
   // System.out.println(largestDigit);
    int smallestDigit = Integer.MAX_VALUE;
    int temp = input1;
    while (temp > 0) {
      int digit1 = temp % 10;
      if (digit1 < smallestDigit) {
        smallestDigit = digit1;
      }
      temp /= 10;
    }
    System.out.println(smallestDigit);
}}