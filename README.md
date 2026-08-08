# Java Fundamentals Practice

A working index of small, standalone Java programs practicing core language basics. This is a learning repository — each file focuses on a single concept rather than being part of one larger application.

## Tech Stack

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)

## Topics Covered

### Basics & Setup
- `Demo.java` – minimal "Hello World" program and class/main method structure
- `intro.java` – declaring and printing multiple variables together (name, age, qualification, address)
- `Variable.java` – primitive data types (`int`, `float`, `double`, `char`, `String`)

### Operators & Expressions
- `op.java` – arithmetic operators (addition, subtraction) with and without intermediate variables
- `gate.java` – logical gate operators (`&&`, `||`) across comparison combinations
- `ter.java` – the ternary operator for conditional assignment
- `inc.java` / `incr.java` – pre-increment vs post-increment behavior

### User Input (`java.util.Scanner`)
- `User_input.java` – reading `int`, `float`, `double`, `char`, and `String` input from the console
- `user_op.java` – arithmetic operators applied to user-provided values
- `user_gate.java` – logical gate operators applied to user-provided values
- `user_ter.java` – ternary operator applied to user-provided values
- `user_incr.java` – increment/decrement operators applied to user-provided values

## Getting Started

Each file is a standalone program. Compile and run any of them with the standard JDK toolchain:

```bash
javac <FileName>.java
java <ClassName>
```

Files prefixed with `user_` (and `User_input.java`) prompt for console input via `Scanner`.
