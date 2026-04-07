# Calculator JavaApplet

A Java-based calculator application that provides a user-friendly interface for performing basic and advanced mathematical operations.

## Overview

Calculator JavaApplet is a desktop application built with Java that allows users to perform calculations efficiently. This project demonstrates core Java programming concepts including GUI development, event handling, and mathematical operations.

## Features

- **Basic Operations**: Addition, subtraction, multiplication, and division
- **Advanced Functions**: Power, square root, and other mathematical operations
- **User-Friendly Interface**: Intuitive GUI for easy interaction
- **Clear History**: View and manage calculation history
- **Error Handling**: Robust error handling for invalid inputs

## Requirements

- **Java Development Kit (JDK)**: Version 8 or higher
- **Operating System**: Windows, macOS, or Linux
- **Memory**: Minimum 256 MB RAM
- **Display**: 1024x768 or higher resolution

## Installation

### 1. Clone the Repository
```bash
git clone https://github.com/sagar12167/Calculator_JavaApplet.git
cd Calculator_JavaApplet
```

### 2. Compile the Source Code
```bash
javac src/*.java
```

### 3. Run the Application
```bash
java -cp src Calculator
```

## Usage

1. Launch the application using the steps above
2. Enter numbers using the number buttons
3. Select an operation (+, -, *, /, etc.)
4. Press the equals (=) button to see the result
5. Use the Clear (C) button to reset the calculator

### Example Calculations
```
5 + 3 = 8
10 * 4 = 40
√16 = 4
2^3 = 8
```

## Project Structure

```
Calculator_JavaApplet/
├── src/
│   ├── Calculator.java       # Main application class
│   ├── GUI.java              # GUI components
│   └── Calculator_Logic.java # Calculation logic
├── README.md                 # Documentation
└── LICENSE                   # License file
```

## Technologies Used

- **Language**: Java
- **GUI Framework**: Swing/AWT
- **Build Tool**: javac (Java Compiler)

## How It Works

1. **Input Handling**: The calculator captures user input from buttons
2. **Expression Parsing**: Operations are parsed and validated
3. **Calculation**: Mathematical operations are executed
4. **Display Output**: Results are displayed on the calculator screen

## Troubleshooting

### Issue: "Command not found: javac"
- **Solution**: Ensure JDK is installed and added to your system PATH

### Issue: GUI doesn't display properly
- **Solution**: Update your Java version to JDK 8 or higher

### Issue: Calculation errors
- **Solution**: Check for division by zero or invalid input formats

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new branch for your feature (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

**Sagar** - [GitHub Profile](https://github.com/sagar12167)

## Support

For issues, questions, or suggestions, please open an [issue](https://github.com/sagar12167/Calculator_JavaApplet/issues) on GitHub.

## Changelog

### Version 1.0
- Initial release
- Basic calculator operations
- GUI implementation
