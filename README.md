# 🧮Primary Math Integer Calculator
A fun, interactive, and educational Java-based calculator built with a custom GUI to simulate how early grade-school math works. Designed with different modes to match the logic used in Grades 4, 5, and 6 — complete with animations, a custom layout, and strict input handling.
-------
📋 Features
🔢 Grade Mode Selector – Switch between Grade 4, 5, and 6 logic using radio buttons.

📟 Dual-Line Display – One line shows the input equation, the other shows the result (both right-aligned).

🧮 Number & Operator Buttons – Traditional layout with digits 0–9, +, −, ×, ÷, =, and a clear button.

✳️ Decimal Button – Only active in Grade 6 mode.

⚙️ Strict Input Format – Follows a “one number → operator → one number” rule.

❗ Smart Error Handling – Shows clear messages for invalid operations (e.g., divide-by-zero, invalid subtraction, remainder in Grade 4, etc.).




### 📐 Grade-Specific Math Logic

| Grade   | Addition | Subtraction                          | Multiplication | Division                                                   |
|---------|----------|---------------------------------------|----------------|-------------------------------------------------------------|
| Grade 4 | Normal   | Only if `a ≥ b`, else error           | Normal         | Only if divisible evenly, else error                        |
| Grade 5 | Normal   | Normal                                | Normal         | Shows quotient and remainder (e.g., `8 ÷ 3 → 2 R 2`)        |
| Grade 6 | Normal   | Normal                                | Normal         | Returns decimal (4 decimal places, e.g., `8 ÷ 3 → 2.6667`)  |

