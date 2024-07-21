import java.util.Scanner;

public class FunOverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
            float prod=calMul(a,b,c);
                System.out.println(prod);
        
    }
    public static int calMul(int a,int b){
        return a*b;
    }
    public static int calMul(int a,int b,int c){///overloaded method with different parameters 
        return a*b*c;
    }
    public static float calMul(float a,int b,int c,float d)//overloaded method with different DataType of the parameters
    {
        return a*b*c*d;
    }

}
