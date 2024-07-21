import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //    int n=sc.nextInt();
        int l=0;
        int j=10;
    /*     while(l<j){
            System.out.println(+l+"  "+j);
            l++;
            j--;}
*/
        
        for(int i=0,u=10;i<u;i++){
            System.out.println(+i+"  "+u);
           u--; 
        }
        for(int i=0;i<5;i++){
            System.out.println("hello");
            i+=3;

        }
        int e=sc.nextInt();
        for(int i=2;i<=e-1;i++){
            if(e%i==0){
                System.out.println("its not prime ");
            }
            System.out.println("prime");

        }
        
while(true){
    System.out.println("enter the number");
    int n=sc.nextInt();
    if(n%10==0){
continue;
    }
    System.out.println("your number is"+n);

}


}
   
    }

