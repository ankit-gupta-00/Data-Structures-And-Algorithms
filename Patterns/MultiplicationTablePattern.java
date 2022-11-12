// You are given a number x.
// You've to write code to print it's Multiplication Table up to 10 in format given below.

// Input Format :

// A number x

// Output Format :

// x * 1 = x
// x * 2 = 2x
// ...
// x * 10 = 10x

// Constraints : 

// 1 <= n <= 10

// Sample Input :

// 3

// Sample Ouput : 

// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30


import java.util.Scanner;
public class MultiplicationTablePattern
{
    public static Scanner scn = new Scanner(System.in);

    // Multiplication Table Pattern.
    public static void multiplicationTablePattern(int x)
    {
        for(int  i = 1; i <= 10; i++)
        {
            System.out.println(x + " * " + i + " = " + (i * x));
        }
    }

    public static void main(String[] args)
    {
        int x = scn.nextInt();
        multiplicationTablePattern(x);
    }   
}
