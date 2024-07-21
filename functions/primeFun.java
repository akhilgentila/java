import java.util.Scanner;
public class primeFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       System.out.println("prime = "+prime1(a));      
    } 
    public static boolean prime1(int a){
        if(a==2)
        {
            return true;
        }            
            for(int i=2;i<a-1;i++){ 
                if(a%i==0){       
                    return false;//we can return the value from the middle of the code also  
               }             
            }
                    return true;  
        }
    }
