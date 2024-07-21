import java.util.Scanner;

public class typeconversion {
    public static void main(String[] args) {
      //  long b=25;
      //  int a= b;
      Scanner sc = new Scanner(System.in);
   //   int number = sc.nextFloat();//
       // float number = sc.nextInt();
      //  System.out.println(number);

        int a= 258;
        char ch=' ';
        int numb=(int)ch;
        System.out.println(numb);
        byte b=(byte)a;
        System.out.println(b);
        byte encode =1;
        //encode = encode*2;//converted to integer
        encode = (byte)(encode*2);

        a=a+1;
        System.out.println(encode);

    }
}
