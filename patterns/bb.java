public class bb {
    public static void main(String[] args) {
        int r=5;
        int c=4;
        for( int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){

                if(i==r||j==c||i+j==c+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
           // System.out.println(alpha.substring(0,j));
          // System.out.print("*");
            }
            System.out.println();// gives the next line

        }
    }
}
