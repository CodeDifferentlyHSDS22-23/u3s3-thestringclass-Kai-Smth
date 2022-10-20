# Return Ready Lab 11

* Part A - Foundations 4.3
* Part B - Challenge

## Part A
### Exercise 1
Go to the package `labs.PartA` and open `ShoppingCart.java`
* Perform the following:
  * Use the indexOf method to get the index for the space
  character (" ") within custName
  * Assign it to spaceIdx
  * Use the substring method and spaceIdx to get the first name
  portion of custName
  * Assign it to firstName and print firstName
### Exercise 2
* Go to the package `labs.PartA` and open `NameMaker.java`
  * Perform the following:
    * Declare String variables: firstName, middleName, lastName,
    and fullName
    * Prompt users to enter their first, middle, and last names and
    read the names from the keyboard
    * Set and display the fullName as firstName+a blank
    char+middleName+a blank char+lastName

## Part B
### Exercise 01

#### Step 01

In the package `labs.partB.ex01` look at the file `IndexingExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab10.part_a.activity` complete the `Activity01_Indexing` per the following:

        Utilizing index on the pre-defined String, start at the first e and locate the index of the very next e.

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):
```
10
```

> Use Example01_IndexOf for reference.

### Example and Activity 02

#### Step 01

In the package `lab11.part_a.examples` look at the file `Example02_Concatenate` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_a.activity` complete the `Activity02_Concatenate` per the following:

    Create two different variables that hold text - a first name and a last name
    Create a third variable that combines both of the variables
    Print out the variable that contains the concatenation 

Your program is working correctly, if when run, the following is the output:
```
Abe Lincoln
```

> Use Example02_Concatenate for reference.


### Example and Activity 03

#### Step 01

In the package `lab11.part_a.examples` look at the file `Example03_Replace` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_a.activity` complete the `Activity03_Replace` per the following:

    Utilizing the built in replace method, create a new String that holds an updated version of the sentence
    with every lowercase r transformed into uppercase. Print out this new string.

Your program is working correctly, if when run, the following is the output:
```
Using StRing Replace to Replace chaRacteR
```

> Use Example03_Replace for reference.

### Example and Activity 04

#### Step 01

In the package `lab11.part_a.examples` look at the file `Example04_Extraction` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_a.activity` complete the `Activity04_Extraction` per the following:

    Utilizing the built in substring method on the predefined String, print out the results to satisfy the example below

Your program is working correctly, if when run, the following is the output:
```
Learn
g Ja
g Java is a good time!
```

> Use Example04_Extraction for reference.

## Part B

### Example and Activity 01

#### Step 01

In the package `lab11.part_b.examples` look at the file `Example01_MathSquareRoot` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_b.activity` complete the `Activity01_Radius` per the following:

    Ask a user to enter the radius, save this input accordingly as the radius
    Create a variable called area that calculates the area using the user's input for the radius (HINT: use a formula)
    Print to the console "The area of circle is: " and the variable area

Your program is working correctly, if when run, the following is the output:
```
Enter the radius: 25
The area of circle is: 1963.25
```

> Use Example01_MathSquareRoot for reference.

### Example and Activity 02

#### Step 01

In the package `lab11.part_b.examples` look at the file `Example02_Minimum` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_b.activity` complete the `Activity02_Maximum` per the following:

    Utilize the built in math function to find the maximum between two numbers
    Print out this result

Your program is working correctly, if when run, the following is the output:
```
Maximum number of 12 and 20 is: 20
```

> Use Example02_Minimum for reference.

### Example and Activity 03

#### Step 01

In the package `lab11.part_b.examples` look at the file `Example02_Minimum` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab11.part_b.activity` complete the `Activity03_AbsoluteValue` per the following:

    Sum the pre defined variables inside of the class
    Utilizing the built in absolute value method, print out the absolute value of the sum

Your program is working correctly, if when run, the following is the output:
```
225
```

> Use Example02_Minimum for reference.


## Part C

In this part of the lab you will complete `KeypadConversion`, the objective of your program should be to ask a user for a message and display that message as a series of key presses on a telephone keypad, seen here (https://en.wikipedia.org/wiki/Telephone_keypad)

Ex1: Input = b then output = 22

Ex2: Input = y then output = 999

Ex3: Input = abc then output = 222222