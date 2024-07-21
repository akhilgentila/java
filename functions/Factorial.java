public class Factorial{
    public static void main(String[] args) {
         int n=6;
         Facto(n);    
}
public static int Facto(int n){
    int Fact=1;
    for(int i=1;i<=n;i++){
        Fact=Fact*i;
    }
    System.out.println(Fact);
    return 55;
}
}