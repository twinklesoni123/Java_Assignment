import java.util.*;
public class Main02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b != 0 || a - b != 0 || a * b != 0 || a / b != 0) {
                System.out.println("The sum is: " + (a + b));
            } else if (a - b != 0  ){
                System.out.println("The difference is: " + (a - b));
            } else if (a * b != 0 ){
                System.out.println("The product is: " + (a * b));
            } else if (a / b != 0 ){
                System.out.println("The quotient is: " + (a / b));
            } else {
                System.out.println("Invalid operation");
            }
        }

            
    }

    

