public class binomialCoffecient {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int Fact2=Facto(b);
        int Fact1=Facto(a);
        int fact3=Facto(a-b);
        bino(Fact1,Fact2,fact3);
    }
    public static int Facto(int n){
        int Fact=1;
        for(int i=1;i<=n;i++){
            Fact=Fact*i;
        }
        return Fact;
}
public static int bino(int a,int b,int c){
int binomialCoffecient_=a/(b*(c));
System.out.println(binomialCoffecient_);

    return binomialCoffecient_;

}


}