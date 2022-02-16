_java-programming.mooc.fi_

# Printing - Java Programming

6-7 minutes

The print command System.out.println("Hello world"); prints the text "Hello world".

`$ System.out.println("Hello world!");`

Sample output

`$ Hello world!`

In this material, text boxes like the one above demonstrate an output produced by the example code. Accordingly, the above program would produce the print output "Hello World!". You can try any of these examples in the exercise template named "Sandbox", which you will find in the programming environment.

You can print any text you want with the command, as long as the command System.out.println("arbitrary text"); — i.e., System dot out dot println open parenthesis ( "the text" close parenthesis ) and semicolon ; remains unchanged. The command below will print the text "Hello there!".

`$ System.out.println("Hello there!");`

Sample output

`$ Hello there!`

Program Boilerplate

In Java, our programs have to include some boilerplate code to function. This boilerplate, an example of which is shown below, for example tells the computer what your program is called. Below, the name of the program is Example. This name has to correspond to the name of the file that contains the source code (e.g. Example.java).

```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Text to be printed");
    }
}
```

Execution of the program starts from the line that follows public static void main(string[] args) {, and ends at the closing curly bracket }. Commands are executed one line at a time. We'll learn what the terms public class and public static void mean later on. In the above example, System.out.println("Text to be printed") is the only command to be executed. Its output is:

Sample output

Text to be printed

Here's the second programming exercise of this course. If you'd like, you can watch this video on how to solve the exercise first:

Programming exercise:
Ada Lovelace

The exercise template has the following boilerplate code:

```java
public class AdaLovelace {
    public static void main(String[] args) {
    // Write your program here

    }
}
```

The line "// Write your program here" is a line comment, and the computer will ignore it when executing the program. Add a new line below the line comment that prints the string "Ada Lovelace" and run the program. The output of the program should be:

Sample output

`Ada Lovelace`

Once you've finished the exercise and see that it prints the correct string, return the exercise to the TMC server. After that, you can read more about Ada Lovelace, who was one of the first programmers.

Exercise submission instructions

You can see the solution in the Test My Code -service either in TMCBeans or in TMC website after completing the exercise.
Printing Multiple Lines

Programs are constructed command-by-command, where each command is placed on a new line. In the example below, the command System.out.println appears twice, which means that two print commands are being executed in the program.

```java
public class Ohjelma {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
```

The program above will print:

Sample output

Hello world! ... and the universe!

Programming exercise:
Once Upon a Time

The exercise template comes with the following template:

```java
public class OnceUponATime {
    public static void main(String[] args) {
    // Write your program here

    }

}
```

Modify the program so that it will print the following text. Use three System.out.println-commands for printing.

Sample output

Once upon a time there was a program

Exercise submission instructions

You can see the solution in the Test My Code -service either in TMCBeans or in TMC website after completing the exercise.

Programming exercise:
Dinosaur

The exercise comes ready with the following template:

```java
public class Dinosaur {
    public static void main(String[] args) {
    // Write your program here
    }
}
```

Edit the program so that it will print the following text. Use the "sout"-shorthand for writing the print commands.

Sample output

`Once upon a time there was a dinosaur`

Exercise submission instructions
Command parameters

The information to be printed by the print command, i.e. its parameters, are passed to it by placing them inside the parentheses () that follow the command. For example, passing Hi as a parameter to the System.out.println command is done like this: System.out.println("Hi").
Semicolon Separates Commands

Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

System.out.println("Hello "); System.out.println("world"); System.out.println("!\n");

Sample output

Hello world !

Although the previous example works, it's important to be considerate of other programmers (and your future self!) and to use line breaks. That way, anyone reading the program knows that each line does only a single concrete thing.
Comments

Source code can be commented to clarify it or to add notes. There are two ways to do this.

    Single-line comments are marked with two slashes //. Everything following them on the same line is interpreted as a comment.
    Multi-line comments are marked with a slash and an asterisk /*, and closed with an asterisk followed by a slash */. Everything between them is interpreted as a comment.

Below is an example of a program where both are used.

```java
public class Comments {
    public static void main(String[] args) {
        // Printing
        System.out.println("Text to print");
        System.out.println("More text to print!");
        /* Next: - more on printing - more practice - variables - ...*/
        System.out.println("Some other text to print");
        // System.out.println("Trying stuff out")
    }
}
```

The last line of the example shows a particularly handy use-case for comments. Code that has been written does not need to be deleted to try out something else.
