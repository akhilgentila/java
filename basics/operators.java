public class operators {
    public static void main(String[] args) {
        int a=18;
        int b= 55;
        System.out.println(a+b);//additon
        System.out.println(a-b);//subract
        System.out.println(a*b);//mul
        System.out.println(a/b);//div
        System.out.println(a%b);//modulo
        // unary operators 

        System.out.println("the value is"+a++);
        System.out.println(a);
        System.out.println("the value is "+(++b));

////// pre incriment
        int ss= 23;
        int c=++ss;
        System.out.println("the ss value is "+ss);
        System.out.println("the o/p is: "+c);
// post incerement
        int ss1= 23;
        int c1=ss1--;
        System.out.println("the o/p value of c1 is: "+c1);
        System.out.println("the ss1 value is "+ss1);

        // logical operators
        System.out.println((1<2)&&(3>2));
        System.out.println((1<2)||(3>2));
        System.out.println(!(3>2));
        int akhil=23;
        int nikhil =33;
        akhil=nikhil;
        System.out.println("age of the nikhil is "+akhil);





        float s1=2;
        float s2=5 ;
        int  e1=(int)(s1*s2/s1);

        int e2=(int)(s1*(s2/s1));
        System.out.println(e1);
        System.out.println(e2);







        float f1 = 2.0f;
        float f2=4.0f;
        float result =f1*f2;
        System.out.println("the result is "+result);


        int size=20;
        Integer[] arr=new Integer[size];
        for (int i=0;i<size;++i){
            System.out.println(arr[i]);
            
        }


    }
}
