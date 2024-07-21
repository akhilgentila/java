import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        int large=(5<3)?5:3;
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        String k=(number%2==0)?"even":"odd";
 //System.out.println(k);
 String v=(number>=33)?"pass":"fail";
 System.out.println(v);

    }
}
