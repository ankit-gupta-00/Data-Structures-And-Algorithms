// You are given as input marks of a student.
// Display an appropriate message based on the following rules: 
//     for marks above 90, print excellent
//     for marks above 80 and less than equal to 90, print good
//     for marks above 70 and less than equal to 80, print fair
//     for marks above 60 and less than equal to 70, print meets expectations
//     for marks less than equal to 60, print below par.

// Input Format : 

// Input is handled by you and provided as variable marks.

// Output Format :

// Appropriate message based as per student's marks.

// Constraints : 

// No Constraints.

// Sample Input : 

// 92

// Sample Ouput :

// excellent


// Method 1 : ( Input is Taking in the Main Function )

// import java.util.Scanner;
// public class GradingSystem
// {
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         float marks = scn.nextFloat();
//         if(marks > 90)
//         {
//             System.out.print("excellent");
//         }
//         else if(marks > 80 && marks <= 90)
//         {
//             System.out.print("good");
//         }
//         else if(marks > 70 && marks <= 80)
//         {
//             System.out.print("fair");
//         }
//         else if(marks > 60 && marks <= 70)
//         {
//             System.out.print("meets expectations");
//         }
//         else
//         {
//             System.out.print("below par");
//         }
//     }
// }


// Method 2 : ( Input is Taking in the Function Creation )

// import java.util.Scanner;
// public class GradingSystem
// {
//     public static Scanner scn = new Scanner(System.in);
//
//     // Grading System.
//     public static void gradingSystem()
//     {
//         float marks = scn.nextFloat();
//         if(marks > 90)
//         {
//             System.out.print("excellent");
//         }
//         else if(marks > 80 && marks <= 90)
//         {
//             System.out.print("good");
//         }
//         else if(marks > 70 && marks <= 80)
//         {
//             System.out.print("fair");
//         }
//         else if(marks > 60 && marks <= 70)
//         {
//             System.out.print("meets expectations");
//         }
//         else
//         {
//             System.out.print("below par");
//         }
//     }
//
//     public static void main(String[] args)
//     {
//         gradingSystem();
//     }
// }


// Method 3 : ( Input is Taking in the Main Function and passing the value through the Function Creation )

import java.util.Scanner;
public class GradingSystem
{
    public static Scanner scn = new Scanner(System.in);

    // Grading System.
    public static void gradingSystem(float marks)
    {
        if(marks > 90)
        {
            System.out.print("excellent");
        }
        else if(marks > 80 && marks <= 90)
        {
            System.out.print("good");
        }
        else if(marks > 70 && marks <= 80)
        {
            System.out.print("fair");
        }
        else if(marks > 60 && marks <= 70)
        {
            System.out.print("meets expectations");
        }
        else
        {
            System.out.print("below par");
        }
    }

    public static void main(String[] args)
    {
        float marks = scn.nextFloat();
        gradingSystem(marks);
    }
}
