import java.util.Scanner;

public class CallByValue__Swap{

    //swap-- values exchange
    public static void swap(int a,int b){
        int temp=a;
        a=b;                                //"the values of a&b are changed within the method "
        b=temp;
        System.out.println("a=  "+a);       //"not out size the method "
        System.out.println("b=  "+b);


    }

    //call by value
    public static void change__a(int a){
        a=10;
        System.out.println("changed value of a is =="+a);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("edjhdu");
      char rr=sc.next().charAt(0);
      System.out.println(rr);
        int a=5;

        int b=6;
        swap(a,b);
        change__a(a);
        System.out.println("original value of a:  "+a);
        System.out.println("original value of b:  "+b);

    }
    

    


}
