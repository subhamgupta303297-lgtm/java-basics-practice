import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        if (n <= 1) {
            System.out.println("Not prime number");
        } else {
            boolean isprime = true; // Scope ab pure else block ke andar hai

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }

            // Comparison using == or directly boolean condition
            if (isprime) {
                System.out.println("prime number");
            } else {
                System.out.println("Not prime number");
            }
        }

        scan.close();
    }
}