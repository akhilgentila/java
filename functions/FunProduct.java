public class FunProduct {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
      Mul(num1,num2); 
       int return1= Mul(num1,num2);
       System.out.println("the return value"+return1);
       
        
    }
    public static int Mul(int a ,int b){
        int prod=a*b;
        System.out.println("the product "+prod);
        return 55;
    }
}
