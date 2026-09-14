package LEVEL1;

import java.util.*;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        text = text.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(text).reverse().toString();
        sc.close();

        if (text.equals(reversed)) {
            System.out.println("IT IS A PALINDROME");

        } else {
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}