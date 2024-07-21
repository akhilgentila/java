import java.util.Scanner;

public class addfunpara {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();//"arguments"//
       int sum= addwithpara(a, b);//this sum is not the same variable as used in the method givenas the addwithpara 
       System.out.println("sum is ::"+sum);
        
    }
    public static int addwithpara(int  um,int nd){
            int sum=um+nd;//this sum is not the same variable as used in the main method
            System.out.println(sum);
               return 5;// "parameters" // 
    }
}
