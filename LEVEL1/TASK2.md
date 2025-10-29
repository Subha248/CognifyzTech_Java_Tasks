
---

## 🔁 **TASK 2 – Palindrome Checker (Java)**


---

### 🎯 **Objective**

To develop a Java program that checks whether a given **word or phrase** is a **palindrome** — meaning it reads the same forward and backward (ignoring spaces and case).

This task enhances understanding of **string manipulation**, **loops**, and **conditional logic** in Java.

---

### 💻 **Full Code**

```java
import java.util.*;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String text = sc.nextLine();

        // Remove spaces and convert to lowercase
        text = text.replaceAll("\\s", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(text).reverse().toString();
        sc.close();

        // Compare original and reversed strings
        if (text.equals(reversed)) {
            System.out.println("IT IS A PALINDROME");
        } else {
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}
```

---

### 🧠 **Explanation**

1. The program begins by importing the `Scanner` class to accept user input.
2. The user is prompted to enter a **word or phrase**.
3. To ensure the comparison ignores spaces and case, the code uses:

   ```java
   text = text.replaceAll("\\s", "").toLowerCase();
   ```

   * `replaceAll("\\s", "")` removes all spaces
   * `toLowerCase()` converts all letters to lowercase
4. A reversed version of the string is created using:

   ```java
   String reversed = new StringBuilder(text).reverse().toString();
   ```

   The `StringBuilder` class has a built-in `reverse()` method that flips the characters.
5. The program then checks:

   * If the **original** and **reversed** strings are equal → It’s a palindrome.
   * Otherwise → It’s not a palindrome.
6. The result is printed accordingly.

---

### 🧾 **Sample Outputs**

✅ **Example 1**

```
Enter a word or phrase:
Madam
IT IS A PALINDROME
```

❌ **Example 2**

```
Enter a word or phrase:
Hello
IT IS NOT A PALINDROME
```

✅ **Example 3**

```
Enter a word or phrase:
Never odd or even
IT IS A PALINDROME
```

---

### 🪄 **Concepts Used**

* **String Manipulation** → Removing spaces, changing case, reversing strings
* **Conditional Statements** → `if-else` comparison
* **User Input Handling** → `Scanner` class

---

