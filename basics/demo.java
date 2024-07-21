import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the price of pen");
        float pen=sc.nextFloat();
        System.out.println("enter the price of pencil");
        float pencil=sc.nextFloat();
        System.out.println("enter the price of rasar");
        float erasar=sc.nextFloat();
        float out=pen+pencil+erasar;
        System.out.println("total bill:"+out);

        System.out.println("after gst: "+(out+out*.18f));
        int  $='a';
        System.out.println($);


    }
}
