import java.util.Scanner;
import java.util.*;

public class prime{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        int n=sc.nextInt();
        if(n==2){
            System.out.println("prime");
        }else{

            for(int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime=false;
                }
                
            }
            if(isPrime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
            
        }
    }
}