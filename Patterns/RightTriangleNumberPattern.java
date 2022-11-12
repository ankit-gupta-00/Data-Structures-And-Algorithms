// You are given a number n.
// You've to create a pattern of * and separated by tab as shown in output format.

// Input Format :

// A number n

// Output Format :

// 1
// 2   3
// 4   5   6
// 7   8   9   10
// ...

// Constraints :

// 1 <= n <= 44


import java.util.Scanner;
public class RightTriangleNumberPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Right Triangle Number Pattern.
    public static void rightTriangleNumberPattern(int n)
    {
        int nst = 1;
        int val = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val++ + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        rightTriangleNumberPattern(n);
    }
}
