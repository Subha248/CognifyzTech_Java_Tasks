package LEVEL2;

import java.util.*;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        int score = 0;

        if (password.length() > 8)
            score++;
        if (password.length() > 12)
            score++;
        if (containUP(password))
            score++;
        if (containLOW(password))
            score++;
        if (containDigit(password))
            score++;
        if (containSpecial(password))
            score++;

        String strength;

        switch (score) {
            case 0:
            case 1:
                strength = "Weak";
                break;
            case 2:
                strength = "Medium";
                break;
            case 3:
                strength = "Medium";
                break;
            case 4:
                strength = "Medium";
                break;
            case 5:
                strength = "Strong";
                break;
            case 6:
                strength = "Very Strong";
                break;
            default:
                strength = "Unknown";

        }
        System.out.println("Your password strength is:" + strength);

        System.out.println("Suggestions for your password:");

        if (password.length() < 8) {
            System.out.println("Please enter password minimum  8 characters");
        }
        if (password.length() < 12) {
            System.out.println("For a high strength password, use up to 12 characters");
        }
        if (!containUP(password)) {
            System.out.println("Please include uppercase letters");
        }
        if (!containLOW(password)) {
            System.out.println("Please include lowecase letters");
        }
        if (!containSpecial(password)) {
            System.out.println("Please include special characters");
        }
        if (!containDigit(password)) {
            System.out.println("Please include digits");
        }
        if (score == 6) {
            System.out.println("Your password is very strong! Great job ");
        } else if (score == 5) {
            System.out.println("Your password is strong enough!");
        }

        sc.close();
    }

    // methods
    // uppercase
    public static boolean containUP(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }
        return false;
    }

    // lowrcase
    public static boolean containLOW(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                return true;
        }
        return false;
    }

    // digits
    public static boolean containDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    public static boolean containSpecial(String s) {
        String special = "!@#$%^&*-_=+[]{}|;:'\",.<>/?`~";
        for (char c : s.toCharArray()) {
            if (special.indexOf(c) != -1)
                return true;
        }
        return false;
    }

}
