import java.util.*;
public class switch_e {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    switch (x) {
        case 1:
            System.out.println("samosa");
            break;
        case 2:
        System.out.println("pizza");
            break;
            case 3:
            System.out.println("burger");
            break;
            case 4:
            System.out.println("mango shake");
            break;
            case 5:
            System.out.println("milk shake");
            break;
        default:
        System.out.println("please enter valid number");
            break;
    }
}
}

