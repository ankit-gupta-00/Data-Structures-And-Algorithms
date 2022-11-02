// Program to print the Multiplication Table of a given number.

// Input Format :

// A number num

// Output Format :

// Multiplication Table of num

// Sample Input :

// 5

// Sample Output :

// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 8 = 45
// 5 * 10 = 50


import java.util.Scanner;
public class MultiplicationTable
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
        int num = scn.nextInt();
        multiplicationTable(num);
    }
}
