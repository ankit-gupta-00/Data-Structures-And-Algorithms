// You are required to print a 'Z' of size Five using '*'.

// Input Format :

// There is no input.

// Output Format : 

// *****
//    *
//   *
//  *
// *****

// Constraints : 

// No Constraints


// Method 1 : ( Using Five Print Statements )

// public class PrintZ
// {
//     public static void main(String[] args)
//     {
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
//     }
// }


// Method 2 : ( Using Only One Print Statement )

// public class PrintZ
// {
//     public static void main(String[] args)
//     {
//         System.out.print("*****\n   *\n  *\n *\n*****");
//     }
// }


// Method 3 : ( Using Function and Five Print Statements )

// public class PrintZ
// {
//     // Function Creation.
//     public static void printZ()
//     {
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
//     }
//     public static void main(String[] args)
//     {
//         // Function Calling.
//         printZ();
//     }
// }


// Method 4 : ( Using Function and Only One Print Statement )

public class PrintZ
{
    // Function Creation.
    public static void printZ()
    {
        System.out.print("*****\n   *\n  *\n *\n*****");
    }
    public static void main(String[] args)
    {
        // Function Calling.
        printZ();
    }
}
