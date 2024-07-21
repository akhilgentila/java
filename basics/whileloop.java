import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h=0;
        while(h<=10){
           
            System.out.println("Hello world"+"   "+ +h);
            h++;

        }
        int counter =1;
    int n=5 ;
        while (counter<=n) {
            System.out.println(counter);
            h++;
            counter++;
        }
        int a=5;
        int sum=0;
        while(sum<(a*(a+1))/2){
            sum=sum+1;
            
        }
        // System.out.println(" the sum avgts " +sum);

         int e=5;
         int r=1;
         int t=0;
         while(r<=e){
            t=t+r;
            r++;

         }
         System.out.println(" hujkb"+t);
         for(int i=0;i<4;i++){
             for(int j=0;j<3;j++){
                 System.out.print('*');
                }
                System.out.println('*'+" outer loops");

         }
         int nub=19;
         String m;
         m=nub;

    //    System.out.println(" the sum avg =="+(n*(n+1))/2);
    }
}
