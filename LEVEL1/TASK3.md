
---

## ⚙️ TASK 3 – Simple Calculator

### 💻 Source Code

```java
import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        sc.close();

        double result;

        if (op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed!");
            }
        } else {
            System.out.println("Invalid operator! Please enter +, -, *, or /.");
        }
    }
}
```

---

### 🧠 Explanation

* The program takes **two numbers** and an **operator** as input from the user.
* Based on the chosen operator, it performs the respective **arithmetic operation**.
* Division by zero is **safely handled** using a condition check.
* The program finally prints the **calculated result**.

---

### 🧾 Example Output

```
Enter first number: 10
Enter second number: 5
Enter the operator (+, -, *, /): /
Result: 2.0
```

---

