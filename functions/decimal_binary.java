public class decimal_binary {
    public static void main(String[] args) {
        d_b(2);
    }
    public static void d_b(int n){
        int pow=0;
        int binary=0;
        while (n>0) {
            
            int a=n%2;
             binary=binary+(a*(int)Math.pow(10, pow));
             n/=2;
             pow++;
            
        }
        System.out.println(binary);


    }
}
