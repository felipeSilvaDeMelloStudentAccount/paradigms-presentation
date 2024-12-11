# paradigms-presentation

## Switch Code Smell

This project is an exercise to **refactor the Middle Man code smell** in Java, particularly when dealing with **many `if` statements or `switch` cases**. The goal is to demonstrate how to refactor such code using **Polymorphism**, making it cleaner and more maintainable.

---

## Original Code Smell

### Problems with the Original Design:
- **Middle Man Smell**: The `AccountManager` class unnecessarily delegates logic to other classes.
- **Switch Statement Smell**: Logic is tightly coupled to specific account types, leading to duplication and poor extensibility.

### Code Location:
The original code can be found in the `/src/main/java/org/example/codesmell/` package.

To view the original code in the repository:
- Navigate to commit: `951404b`
- [View on GitHub](https://github.com/felipeSilvaDeMelloStudentAccount/paradigms-presentation/commit/951404bdbfe160ce855904a081dfa549b341621b)

---

## Refactored Design

### Improvements in the Refactored Design:
- **Polymorphism**: Replaced the `switch` logic with polymorphic behavior.
- **Interface & Abstract Classes**: Introduced the `Account` interface and `AccountCommon` abstract class to encapsulate common behaviors and improve design.
- **Flexible and Readable**: The `BankApp` class now directly interacts with polymorphic `Account` objects, making the code more extensible and maintainable.

### Code Location:
The refactored code can be found in the `/src/main/java/org/example/refactored/` package.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/felipeSilvaDeMelloStudentAccount/paradigms-presentation.git
    ```
2. Open the project in a Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
3. Navigate to the BankApp class in the src folder.
4. Run the main method to see the output for both the original and refactored designs.

## Key Concepts Covered
### 1 . Middle Man Code Smell
- Definition: Delegating too much responsibility unnecessarily to another class.
- Solution: Eliminate the middle man by interacting directly with the objects that own the behavior.

### 2. Switch Statement Smell

- Definition: Using switch statements to control behavior based on type codes, leading to duplication.
- Solution: Replace switch statements with polymorphism.

### 3. Polymorphism

- Definition: Enables objects to define their unique behavior while sharing functionality from a parent class.
    - Benefits:
        - Cleaner, more readable code.
        - Adheres to the Open/Closed Principle.
        - Easily extendable to support new account types.
