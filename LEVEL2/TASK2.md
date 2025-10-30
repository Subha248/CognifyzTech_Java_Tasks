
---

```java
package LEVEL2;  // package name

import java.util.*;  // importing all utility classes (for Scanner)

public class TASK2 {  // main class

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner to take input
        System.out.println("Enter your password:");
        String password = sc.nextLine(); // take password input
        int score = 0; // variable to keep track of password strength

        // checking password features and increasing score
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

        String strength; // to store final strength level

        // decide strength based on score
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
                strength = "Strong";
                break;
            default:
                strength = "Unknown";
        }

        // print strength
        System.out.println("Your password strength is:" + strength);
        System.out.println("Suggestions for your password:");

        // suggestions for improvement
        if (password.length() < 8) {
            System.out.println("Please enter password minimum  8 characters");
        }
        if (password.length() < 12) {
            System.out.println("For high strength password you can put upto 12 characters");
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
        sc.close(); // close scanner
    }

    // method to check uppercase letters
    public static boolean containUP(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }
        return false;
    }

    // method to check lowercase letters
    public static boolean containLOW(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                return true;
        }
        return false;
    }

    // method to check digits
    public static boolean containDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    // method to check special characters
    public static boolean containSpecial(String s) {
        String special = "!@#$%^&*-_=+[]{}|;:'\",.<>/?`~";
        for (char c : s.toCharArray()) {
            if (special.indexOf(c) != -1)
                return true;
        }
        return false;
    }
}
```

---

###  Full explanation (step by step):**

1. **package LEVEL2;**
   → Just groups your file under a package called “LEVEL2”. It’s like a folder name.

2. **import java.util.*;**
   → Brings Scanner class from Java library so you can take user input.

3. **public class TASK2**
   → The main class where your program starts.

4. **Scanner sc = new Scanner(System.in);**
   → Creates an object `sc` to take input from the keyboard.

5. **String password = sc.nextLine();**
   → Reads what the user types as the password.

6. **int score = 0;**
   → This variable increases when password has good features (uppercase, digits, etc.).

7. **if statements (length, uppercase, lowercase, etc.)**
   → These lines check different things in your password.
   Each condition that passes adds `+1` to the score.

8. **switch(score)**
   → Checks the total score and decides if password is **Weak**, **Medium**, or **Strong**.

9. **System.out.println(...)**
   → Displays your password strength and suggestions.

10. **Suggestions section**
    → Gives friendly hints to improve password — for example, add uppercase, digits, etc.

11. **Methods (containUP, containLOW, containDigit, containSpecial)**
    → Each method checks one particular rule:

    * `containUP` → checks uppercase
    * `containLOW` → checks lowercase
    * `containDigit` → checks numbers
    * `containSpecial` → checks special symbols like @ or #

12. **sc.close();**
    → Closes the Scanner object to free memory (good habit).

---

