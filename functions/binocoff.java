public class binocoff {
    public static void main(String[] args) {
        bino(5,3);
        
    }

    public static int bino(int a,int b){

        int Fact_a=Facto(a);
        System.out.println("the factorial of a is :"+Fact_a);
        int Fact_b=Facto(b);   
        System.out.println("the factorial of b is :"+Fact_b);
      int Fact_a_b=Facto(a-b);
      int Factorial_=Fact_a/(Fact_b*(Fact_a_b));
        System.out.println("the binomial-coffecirnt of "+a+","+b+" ="+Factorial_);
        return Factorial_;

    }
    public static int Facto(int n){
        int Fact=1;
        for(int i=1;i<=n;i++){
            Fact=Fact*i;
        }
       // System.out.println(Fact);
        return Fact;
    
}
}