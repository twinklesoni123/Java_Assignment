// Student Input System
// Create a class StudentInputSystem. Accept student age from

// user. Handle invalid input using multiple catch blocks such as
// InputMismatchException and ArithmeticException.

// Output: If valid: &#39;Student age is: &lt;age&gt;&#39; Else: &#39;Invalid input&#39;
import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // Example check (to trigger ArithmeticException if age is 0)
            int check = 10 / age;

            if (age > 0) {
                System.out.println("Student age is: " + age);
            } else {
                System.out.println("Invalid input");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
