// Program to print the Multiplication Table From 1 To N ( N is the number entered by the user ).

// Input Format :

// A number N

// Output Format :

// Multiplication Table From 1 To N

// Sample Input :

// 2

// Sample Output :

// 1 * 1 = 1
// 1 * 2 = 2
// 1 * 3 = 3
// 1 * 4 = 4
// 1 * 5 = 5
// 1 * 6 = 6
// 1 * 7 = 7
// 1 * 8 = 8
// 1 * 9 = 9
// 1 * 10 = 10

// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20


import java.util.Scanner;
public class MultiplicationTableFrom1ToN
{
    public static Scanner scn = new Scanner(System.in);

    // Multiplication Table.
    public static void multiplicationTable(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            int multiply = num * i;
            System.out.println(num + " * " + i + " = " + multiply);
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++)
        {
            multiplicationTable(i);
            System.out.println();
        }
    }
}
