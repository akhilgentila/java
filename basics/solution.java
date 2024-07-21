import java.util.Scanner;

public class solution{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    String x=sc.nextLine();
    if(x.charAt(0)=='-'){
        System.out.println("IT IS A NEGITIVE NUMBER ");
    }
    else{
        System.out.println("positive number");
    }

    }
}
