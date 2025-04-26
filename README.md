# 🧮 Primary Math Grade-Level Calculator

An interactive, user-friendly JavaFX calculator designed with different math rule sets based on grade level: Grade 4, Grade 5, and Grade 6. Built entirely in Java with a focus on UI design, user experience, and educational logic-based control.

---

## 📦 Features

- 🎓 **Grade Modes**: Switch between Grade 4, 5, and 6 logic using radio buttons.
- 📟 **Dual-Line Display**: Input equation + result area with a clean, rounded screen.
- 🔢 **Button Grid**: Fully functional number pad, operators, clear, delete, and off buttons.
- ➗ **Math Engine**: Rules differ by grade:
  - Grade 4: Only allows subtraction if a ≥ b and integer-only division with no remainder.
  - Grade 5: Allows subtraction and returns quotient with remainder.
  - Grade 6: Returns division as a decimal with 4 decimal places.
- 🎨 **Custom Logo**: Displays a calculator logo at the top.
- 🖱️ **Hover & Press Effects**: Interactive animations on all buttons.


----------------------


## 📁 Project Structure

| Class             | Responsibility                                                    |
|------------------|--------------------------------------------------------------------|
| `CalculatorApp`   | Main application launcher and UI builder                          |
| `Screen`          | Manages the equation and result text fields + background visuals  |
| `GradeSelector`   | Controls the toggle between Grade 4, 5, and 6                      |
| `ButtonGrid`      | Creates and manages all calculator buttons                        |
| `CalculatorLogic` | Contains the math logic and grade-based rules                     |


----------------------


## 🧮 Grade-Based Logic

| Grade   | Addition | Subtraction                        | Multiplication | Division                                                   |
|---------|----------|-------------------------------------|----------------|-------------------------------------------------------------|
| Grade 4 | Normal   | Only if `a ≥ b`, else error         | Normal         | Only if divisible evenly, else error                        |
| Grade 5 | Normal   | Normal                              | Normal         | Shows quotient and remainder (e.g., `8 ÷ 3 → 2 R 2`)        |
| Grade 6 | Normal   | Normal                              | Normal         | Decimal output with 4 decimal places (e.g., `8 ÷ 3 → 2.6667`) |



----------------------


## 🚀 How to Run


## 🧩 Running the Project in BlueJ

If you're using **BlueJ**, follow these steps to run the calculator:

### ✅ 1. Install BlueJ
- Download and install from: [https://bluej.org](https://bluej.org)

### ✅ 2. Open the Project
1. Open BlueJ.
2. Go to **Project → Open Project...**
3. Select the folder containing all `.java` files (e.g., `CalculatorApp.java`, `ButtonGrid.java`, etc.)

### ✅ 3. Compile All Classes
- Click the **“Compile”** button at the top of the BlueJ window.
- Make sure it shows **"Class compiled – no syntax errors"**.

### ✅ 4. Run the Application
1. Right-click the `CalculatorApp` class.
2. Choose `void main(String[] args)`.
3. Click **“OK”** (leave the input field blank).
4. Your calculator app will launch!

### ⚠️ If You're Using JavaFX
If your project uses **JavaFX**, you may need to:
- Go to **Tools → Preferences → Libraries**
- Add the path to your JavaFX SDK (e.g., `/path/to/javafx-sdk/lib`)
- Then in **Project → Project Properties → JavaFX VM options**, add:



----------------------


## 📸 Screenshots 

![image](https://github.com/user-attachments/assets/ebc829e0-5767-4b8f-a0f9-45645799b469)



----------------------


## 👨‍💻 Author

**Chukwunonso Daniel Ekweaga**  
A Java developer focused on educational apps, UI design, and logic-based interactions.



