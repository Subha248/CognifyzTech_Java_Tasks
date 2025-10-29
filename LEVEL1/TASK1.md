
---

## 🌡️ **TASK 1 – Temperature Converter (Java)**

**Internship Domain:** Java Development — *Cognifyz Technologies*

---

### 🎯 **Objective**

To create a Java program that converts temperatures between **Celsius** and **Fahrenheit** based on user input.

This task helps understand **user input handling**, **decision-making**, and **arithmetic operations** in Java.

---

### 💻 **Full Code**

```java
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
        }
    }
}
```

---

### 🧠 **Explanation**

1. The program starts by importing the `Scanner` class to take input from the user.
2. It prompts the user to enter:

   * The **temperature value**
   * The **unit of temperature**, either **C** for Celsius or **F** for Fahrenheit
3. The unit input is converted to uppercase to handle both lowercase and uppercase inputs:

   ```java
   char unit = sc.next().toUpperCase().charAt(0);
   ```
4. Using `if-else` statements:

   * If the user enters **C**, it converts Celsius to Fahrenheit using the formula:

     ```
     Fahrenheit = (Celsius × 9/5) + 32
     ```
   * If the user enters **F**, it converts Fahrenheit to Celsius using the formula:

     ```
     Celsius = (Fahrenheit - 32) × 5/9
     ```
5. The result is displayed with the correct unit symbol (°C or °F).
6. If the entered unit is not valid, the program prints an error message.

---

### 🧾 **Sample Output**

```
Enter the temperature:
37
Enter the unit of temperature (C/F):
C
37.0°C = 98.6°F
```

```
Enter the temperature:
100
Enter the unit of temperature (C/F):
F
100.0°F = 37.77777777777778°C
```

---


