package LEVEL1;

import java.util.*;

public class TASK4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // low long the pwd should be
        System.out.print("Enter the desired length: ");
        int n = sc.nextInt();

        System.out.print("Include uppercase letters?(true/false): ");
        boolean incup = sc.nextBoolean();
        System.out.print("Include lowercase letters?(true/false): ");
        boolean inclow = sc.nextBoolean();
        System.out.print("Include special characters?(true/false): ");
        boolean incspecial = sc.nextBoolean();
        System.out.print("Include numbers?(true/false): ");
        boolean incnum = sc.nextBoolean();

        String uppercase = "ABCDEFGHIJKLMNOPQRSRUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialchar = "!@#$%^&*+=-/|";

        String allchars = "";
        if (incup)
            allchars += uppercase;
        if (inclow)
            allchars += lowercase;
        if (incspecial)
            allchars += specialchar;
        if (incnum)
            allchars += numbers;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(allchars.length());
            password.append(allchars.charAt(index));

        }
        System.out.println("Your generated password is: " + password.toString());
        sc.close();
    }
}
