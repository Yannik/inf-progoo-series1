import acm.program.*;
/*
Three variables are used for this program.
The variables are named n1, n2 and n3 of.
The variables are of type int.
The variables are assigned the return of the respective readInt call.

My class "Add3Integers" is a subclass of "ConsoleProgram".
Respectively, "ConsoleProgram" is a superclass of "Add3Integers".
*/

public class Add3Integers extends ConsoleProgram {
    public void run() {
        println("This program adds 3 integers.");
        int n1 = readInt("Enter n1:");
        int n2 = readInt("Enter n2:");
        int n3 = readInt("Enter n3:");
        int total = n1 + n2 + n3;
        println("The total is " + total + ".");
    }
}
