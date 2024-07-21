import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Float pi=3.14f;
        Scanner sc = new Scanner(System.in);
       float r= sc.nextInt();
        
        Float Area=pi*r*r;

        System.out.println("The Ares  IS "+Area);
        int a=1895;
        int unit=(a%10);
        int ten=((a/10)%10);
        int hundred=((a/100)%10);
        int thousand=((a/1000)%10);
        
        // updation inside the loop 
        while(a%10!=0){
            System.out.print(a%10);;
            a/=10;
        }
        //updation after tha loop ends
        int reverse=0;
        while(a%10!=0){
            reverse=(reverse*10)+a%10;
            a/=10;
        }
        System.out.print(reverse);
        System.out.println("enter th numb");
int n=sc.nextInt();
do{
    System.out.println("entwr your numb");
int numbbb=sc.nextInt();
if(numbbb%10==0){
    break;

}
System.out.println(numbbb);
}
        while(n>0);

        
       // System.out.println(unit+""+ten+""+hundred+""+""+thousand);

    }}
