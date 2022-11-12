// You are given a number n.
// You've to write code to print the pattern given in output format below.

// Input Format :

// A number n

// Output Format :

// *** *
//   * *
// *****
// * *
// * ***

// Constraints : 

// 1 <= n <= 10
// Also, n is Odd.


import java.util.Scanner;
public class SwastikStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Swastik Star Pattern.
    public static void swastikStarPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    if((j <= (n / 2) + 1) || (j == n))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if(i <= (n / 2))
                {
                    if((j == (n / 2) + 1) || (j == n))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if(i == ((n / 2) + 1))
                {
                    System.out.print("*");
                }
                else if(i < n)
                {
                    if((j == 1) || (j == (n / 2) + 1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    if((j == 1) || (j >= (n / 2) + 1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        swastikStarPattern(n);
    }
}
