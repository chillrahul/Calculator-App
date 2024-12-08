# Simple Calculator App

A simple, interactive calculator built using HTML, CSS, and JavaScript. This application performs basic arithmetic operations like addition, subtraction, multiplication, division, and percentage calculations. It features a user-friendly interface and error handling for invalid inputs such as division by zero.

---

## Features

- **Basic Arithmetic**: Perform addition, subtraction, multiplication, and division.
- **Percentage Calculation**: Calculate percentages directly.
- **Clear Screen**: Reset the calculator for a new operation.
- **Delete**: Remove the last entered digit.
- **Responsive Design**: Works seamlessly on different screen sizes.
- **Error Handling**: Alerts when attempting division by zero.

---



## Getting Started

### Prerequisites

To run the calculator app, you need a modern web browser like Chrome, Firefox, or Edge.

### Installation

1. Clone this repository or download the ZIP file.
   ```bash
   git clone https://github.com/chillrahul/Calculator-App.git
   ```

2. Open the `index.html` file in your preferred web browser.

---

## Usage

1. Enter numbers using the calculator buttons.
2. Choose an operation (e.g., `+`, `-`, `*`, `÷`, `%`).
3. Press the `=` button to compute the result.
4. Use the `AC` button to clear all inputs or the `DEL` button to delete the last digit.

---

## File Structure

```
.
├── index.html  # HTML structure of the calculator
├── style.css   # CSS for styling the calculator
├── script.js   # JavaScript logic for calculator operations
└── README.md   # Documentation for the project
```

---

## Code Overview

### JavaScript Logic

The calculator logic is implemented in the `Calculator` class in `script.js`. It includes methods for:

- **clear()**: Resets all inputs and operations.
- **delete()**: Deletes the last digit.
- **appendNumber(number)**: Appends digits to the current input.
- **chooseOperation(operation)**: Sets the chosen operation.
- **compute()**: Calculates the result based on the selected operation.
- **updateDisplay()**: Updates the UI to show the current and previous operands.

Event listeners are attached to the calculator buttons for interactive functionality.



- Inspired by basic calculator designs and educational tutorials.
