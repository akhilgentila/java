import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
System.out.println("enter a operation to perform");
        char c=sc.next().charAt(0);
        switch(c){
            case '%':
            System.out.println(a%b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '+':
            System.out.println(a
            +b);
            break;
            default:
            System.out.println("enter a different character");

        }
    }
}

class solution{
     double temp=103.3;
    void run(){
        if(temp>100){
            System.out.println("you have fever");
    
        } 
        else{
            System.out.println("you dont have fever");
        }
    }
}