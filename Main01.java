import java.util.Scanner;

public class Main01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }




    //     if (button == 1) {
    //         System.out.println("Hello");
    //     } else if (button == 2) {
    //         System.out.println("Namaste");
    //     } else if (button == 3) {
    //         System.out.println("Bonjour");
    //     } else {
    //         System.out.println("Invalid button");
    //     }



    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     if (a == b) {
    //         System.out.println("The numbers are equal.");
    //     } else {
    //         if (a > b) {
    //              System.out.println("The first number is greater.");
    //     } else {
    //              System.out.println("The second number is greater .");
    //     }
    // }


    }
}
