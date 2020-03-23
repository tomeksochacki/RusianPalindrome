package ifpalindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to word, forward:");
        String wordforward = scanner.nextLine();
        System.out.println("Enter to word, from behind:");
        String wordfrombehind = scanner.nextLine();

        if (wordforward == wordfrombehind) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }
}

