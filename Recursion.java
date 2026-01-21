import java.util.*;
public class Recursion {
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int num = sc.nextInt();  

        long result = factorial(num);

        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
