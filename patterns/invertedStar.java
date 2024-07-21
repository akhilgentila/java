public class invertedStar {
    public static void main(String[] args) {
        for(int line=5;line>=1;line--){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
                System.out.println();
        }int a=1;
        //////different way of writing the code
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(a);
                a++;
            //  System.out.println();
                
                
            }
                System.out.println();
       
        }
    }

}