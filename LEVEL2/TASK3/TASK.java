package LEVEL2.TASK3;

import java.io.*;
import java.util.*;

public class TASK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("File Encryption/Decryption tool");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");

        System.out.println("Enter your choice (1 or 2) for Encryption/Decrytion:");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your input file path:");
        String input = sc.nextLine();

        System.out.println("Enter yout text output file path:");
        String output = sc.nextLine();

        System.out.println("Enter desired key:");
        int key = sc.nextInt();

        if (choice == 1) {
            encryptFile(input, output, key);// call enc method
        } else if (choice == 2) {
            decryptFile(input, output, key);// call dec method
        } else {
            System.out.println("Invalid number! Please enter choice 1 or 2");
        }
        sc.close();
    }

    // create enc method
    public static void encryptFile(String input, String output, int key) {
        try (

                BufferedReader reader = new BufferedReader(new FileReader(input));
                BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                ch = ch + key;
                writer.write(ch);
            }

            System.out.println("File is Encrypted Successfully!");
        } catch (IOException e) {
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    // create method Decryption
    public static void decryptFile(String input, String output, int key) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader(input));
                BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                ch -= key;
                writer.write(ch);
            }

            System.out.println("File is Decrypted Successfully!");
        } catch (IOException e) {
            System.out.println("Error!" + e.getMessage());
        }
    }
}
