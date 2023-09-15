import java.util.Scanner;

public class PalindromeChecker {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        if (x < 0) {
            return false;
        }

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check for palindrome: ");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            PalindromeChecker solution = new PalindromeChecker();
            boolean isPalindrome = solution.isPalindrome(input);

            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
