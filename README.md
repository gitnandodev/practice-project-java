# Practice: Product List (Java) 🛒✨

Brief description
Small Java practice project demonstrating classes, inheritance, use of `ArrayList` and overriding the `toString()` method.

## Key points ✅

1. Creating a `Product` object with `name`, `price`, and `quantity`.

2. Using `ArrayList` to store `Product` objects.

3. Overriding `toString()` for readable representation.

4. `PerishableProduct` extends `Product` and adds `expirationDate`.

## Project Structure 📁
\- `src\br\com\nandodev\practice\main\Main.java`
\- `src\br\com\nandodev\practice\models\Product.java`
\- `src\br\com\nandodev\practice\models\PerishableProduct.java`

## Activities Performed 🧭
1. Create the `Product` class and a list of products using `ArrayList`.

2. Add products, print the list size, and retrieve them by index.

3. Implement `toString()` and print the list using `System.out.println()`.

4. Add a parameterized constructor to `Product`.

5. Create `PerishableProduct` which uses `super` to initialize inherited attributes and includes `expirationDate`.

## How to run (Windows) 🚀
- Using `IntelliJ IDEA 2025.2.5`:

- Open the project and locate `Main` in `src\br\com\nandodev\practice\main\Main.java`.

- Right-click on `Main` and select `Run 'Main.main()'`.

- Using the command line (cmd or PowerShell):

- Compile:

`javac -d out -sourcepath src src\br\com\nandodev\practice\main\Main.java`

- Run:

`java -cp out br.com.nandodev.practice.main.Main`

## Requirements 🔧
- JDK 11 or higher installed and `JAVA_HOME` configured (Windows).

## Expected output (example) 🖨️
- `Size off array: 4`
- `Product 1: Knife`
- Printing the list with the `toString()` representations of the objects.

## Notes ⚠️
- Practice project; no external integrations or mandatory build tools.

- Source files are in `src` following the `br.com.nandodev.practice` package.

- Ideal for studying OOP, collections, and inheritance in Java. 🧪
