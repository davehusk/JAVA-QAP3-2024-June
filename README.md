# Advanced Programming (Java) - Quantitative Assessment Practice

Dave Husk
Java - QAP3 - June 2024

Time: 30 Minutes

## Overview

This repository contains the source code and solutions for the Quantitative Assessment Practice (QAP) for the Advanced Programming (Java) course. The assessment is designed to test your understanding of inheritance, polymorphism, and object-oriented programming concepts in Java. The assessment includes three main problems involving different Java classes and their interactions.

## Project Structure

```
├── Problem1
│   ├── Person.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── CollegeStudent.java
│   └── Demo.java
├── Problem2
│   ├── Shape.java
│   ├── Circle.java
│   ├── Rectangle.java
│   ├── Square.java
│   └── Demo.java
├── Problem3
│   ├── Point.java
│   ├── MovablePoint.java
│   └── Demo.java
└── README.md
```

## Problem 1: HighSchool Application

### Classes
- `Person.java`: Base class with attributes `name`, `age`, and `gender`.
- `Student.java`: Derived from `Person` with additional attributes `idNum` and `gpa`.
- `Teacher.java`: Derived from `Person` with additional attributes `subject` and `salary`.
- `CollegeStudent.java`: Derived from `Student` with additional attributes `year` and `major`.
- `Demo.java`: Main class to test and demonstrate the functionality of the above classes.

### How to Run
1. Navigate to the `Problem1` directory.
2. Compile the Java files:
   ```sh
   javac Person.java Student.java Teacher.java CollegeStudent.java Demo.java
   ```
3. Run the `Demo` class:
   ```sh
   java Demo
   ```

### Expected Output
```
Coach Bob age: 27 gender: M
Lynne Brooke age: 16 gender: F ID: HS95129 GPA: 3.5
Duke Java age: 34 gender: M subject: Computer Science salary: 50000.0
Ima Frosh age: 18 gender: F ID: UCB123 GPA: 4.0 year: 1 major: English
```

## Problem 2: Shape Superclass and Subclasses

### Classes
- `Shape.java`: Base class with attributes `color` and `filled`.
- `Circle.java`: Derived from `Shape` with additional attribute `radius`.
- `Rectangle.java`: Derived from `Shape` with additional attributes `width` and `length`.
- `Square.java`: Derived from `Rectangle`.
- `Demo.java`: Main class to test and demonstrate the functionality of the above classes.

### How to Run
1. Navigate to the `Problem2` directory.
2. Compile the Java files:
   ```sh
   javac Shape.java Circle.java Rectangle.java Square.java Demo.java
   ```
3. Run the `Demo` class:
   ```sh
   java Demo
   ```

### Expected Output
```
A Shape with color of Red and filled
A Circle with radius=5.0 which is a subclass of A Shape with color of green and filled
A Circle with radius=5.0 which is a subclass of A Shape with color of blue and filled
Circle c area: 78.53981633974483 perimeter: 31.41592653589793
Circle c1 area: 78.53981633974483 perimeter: 31.41592653589793
A Rectangle with width=2.0 and length=3.0 which is a subclass of A Shape with color of green and filled
A Rectangle with width=2.0 and length=3.0 which is a subclass of A Shape with color of green and Not filled
Rectangle r area: 6.0 perimeter: 10.0
Rectangle r1 area: 6.0 perimeter: 10.0
A Square with side=4.0 which is a subclass of A Rectangle with width=4.0 and length=4.0 which is a subclass of A Shape with color of green and filled
A Square with side=4.0 which is a subclass of A Rectangle with width=4.0 and length=4.0 which is a subclass of A Shape with color of yellow and filled
Square sq area: 16.0 perimeter: 16.0
Square sq1 area: 16.0 perimeter: 16.0
```

## Problem 3: Point and MovablePoint Classes

### Classes
- `Point.java`: Base class with attributes `x` and `y`.
- `MovablePoint.java`: Derived from `Point` with additional attributes `xSpeed` and `ySpeed`.
- `Demo.java`: Main class to test and demonstrate the functionality of the above classes.

### How to Run
1. Navigate to the `Problem3` directory.
2. Compile the Java files:
   ```sh
   javac Point.java MovablePoint.java Demo.java
   ```
3. Run the `Demo` class:
   ```sh
   java Demo
   ```

### Expected Output
```
(1.0,2.0)
(3.0,4.0), speed=(0.5,0.5)
After moving: (3.5,4.5), speed=(0.5,0.5)
```
