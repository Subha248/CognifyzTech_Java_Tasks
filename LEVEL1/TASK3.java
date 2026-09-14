package LEVEL1;

import java.util.*;

public class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get total no of subj
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt(); // get total no of subj
        // store in a array
        double[] arr = new double[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the grade " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
            sum = sum + arr[i];

        }
        System.out.print("THE AVERAGE SCORE IS :" + sum / n);
        sc.close();
    }
}
