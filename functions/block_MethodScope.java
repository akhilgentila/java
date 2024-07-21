public class block_MethodScope {
    public static void main(String[] args) {
        {
            int a=45;
        }
        System.out.println(a);//error block scope
    }
    public static void sdd(){
        int k=88;
    }
    public static void main(int [] arg) {
    System.out.println(k);//error method scope
        
 
}
//class scope
//Acess Modifiers -public
//                -private
//                -protected


}

