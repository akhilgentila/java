import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        int age =23;
        if(age>80){
            System.out.println("adult");
            System.out.println("you can drive & vote");
            if(age>22){
                System.out.println("you can drink");
            }
        }
        else{
            System.out.println("yor are not a adult");
        }
        
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
        if(a>b){
            System.out.println("the largest number is "+a);}
        else{
            System.out.println("the largest number is "+b);
        }

        if(a%2==0){
            System.out.println("'a' number are even"+a);
         

        }
        else{
            System.out.println("a is odd");
        }
        if(b%2==0){
            System.out.println("'b' number are even"+b);
         

        }
        else{
            System.out.println("b is odd");
        }
    
System.out.println("enter your income in lack");
        int income=sc.nextInt();
        if(income>10){
            System.out.println("the tax you have to pay is:"+income*.3+"lacks");
            System.out.println("the in come you get after paying tax is "+(income-income*.3)+"lacks");
        }
        else if(income<10&&income>5){
            System.out.println("the tax you have to pay is"+income*.2+"lacks");
            System.out.println("the in come you get after paying tax is "+(income-income*.2)+"lacks");

        }
        else{
            System.out.println("the tax you have to pay is"+0);
        }
    }
}
    
