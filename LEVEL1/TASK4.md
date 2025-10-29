
---

```java
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
```

---

### 🧠 Simple Explanation:

* `package LEVEL1;` → your code is part of a package called **LEVEL1**.
* `import java.util.*;` → imports tools like **Scanner** (for input) and **Random** (for random numbers).

---

```java
Random random = new Random();
Scanner sc = new Scanner(System.in);
```

* Creates objects for random number generation and user input.

---

```java
System.out.print("Enter the desired length: ");
int n = sc.nextInt();
```

* Asks how long the password should be and stores it in `n`.

---

Then the next 4 lines ask if the user wants to include:

* Uppercase letters (`incup`)
* Lowercase letters (`inclow`)
* Special characters (`incspecial`)
* Numbers (`incnum`)

The user types **true** or **false** for each one.

---

```java
String uppercase = "ABCDEFGHIJKLMNOPQRSRUVWXYZ";
String lowercase = "abcdefghijklmnopqrstuvwxyz";
String numbers = "1234567890";
String specialchar = "!@#$%^&*+=-/|";
```

* These are the **groups of characters** that can be used in the password.

---

```java
String allchars = "";
if (incup)
    allchars += uppercase;
if (inclow)
    allchars += lowercase;
if (incspecial)
    allchars += specialchar;
if (incnum)
    allchars += numbers;
```

* Combines only the groups that the user chose (for example, only lowercase and numbers if user says so).

---

```java
StringBuilder password = new StringBuilder();
for (int i = 0; i < n; i++) {
    int index = random.nextInt(allchars.length());
    password.append(allchars.charAt(index));
}
```

* Creates an empty password.
* Loops `n` times (password length).
* Picks a random character from `allchars` and adds it to the password.

---

```java
System.out.println("Your generated password is: " + password.toString());
```

* Shows the final generated password.

---

```java
sc.close();
```

* Closes the Scanner to free memory.

---

✅ **In short:**
This program asks what kind of characters you want and how long the password should be —
then it mixes those randomly to create your password.
