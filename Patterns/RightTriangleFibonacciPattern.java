// You are given a number n.
// You've to create a pattern  and separated by tab as shown in output format.  

// Input Format : 

// A number n

// Output Format :

// 0
// 1   1
// 2   3   5
// 8   13  21  34
// ...

// Constraints :

// 1 <= n <= 5


import java.util.Scanner;
public class RightTriangleFibonacciPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Right Triangle Fibonacci Pattern.
    public static void rightTriangleFibonacciPattern(int n)
    {
        int nst = 1;
        int a = 0;
        int b = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        rightTriangleFibonacciPattern(n);
    }
}
