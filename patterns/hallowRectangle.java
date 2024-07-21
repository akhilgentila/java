public class hallowRectangle {
    public static void main(String[] args) {
        int rows=4;
        int colums=5;
        Pratten(rows,colums);
     
    }
    public static void Pratten(int rows,int colums){
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colums;j++){
                //System.out.print("*");
                if(j==1||i==rows||j==colums||i==1){
                System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println("");
        }
    }
}
 