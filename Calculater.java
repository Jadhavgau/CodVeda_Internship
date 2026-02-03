import java.util.*;

public class Calculater {

    public static int ArithmeticOperation ( int a, int b, int choice) {
        int result = 0;

         switch (choice) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = a % b;
                break;

            case 5:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter value for num2 : ");
        int b = sc.nextInt();

        System.out.println("Enter 1 for Adddition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiply");
        System.out.println("Enter 4 for Modulus");
        System.out.println("Enter 5 for Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int answer = ArithmeticOperation(a, b, choice);
        System.out.println("Result = " + answer);

    }
}