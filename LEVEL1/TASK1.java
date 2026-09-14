package LEVEL1;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = sc.nextDouble();
        System.out.println("Enter the unit of temperature (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);
        sc.close();

        if (unit == 'C') {
            double fahrenheit = (temp * 9.0 / 5.0) + 32;
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else if (unit == 'F') {
            double celsius = (temp - 32) * 5.0 / 9.0;
            System.out.println(temp + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid Input! Please enter C or F.");
        } }} 
