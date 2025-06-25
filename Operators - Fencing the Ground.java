import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Scanner to read input

        int length = sc.nextInt();                   // Read length
        int breadth = sc.nextInt();                  // Read breadth

        int perimeter = 2 * (length + breadth);      // Calculate rope length (perimeter)
        int area = length * breadth;                 // Calculate carpet area

        System.out.println("The required length is " + perimeter + " m");
        System.out.println("The required area of carpet is " + area + " sqm");
    }
}

--------------------------------------------------------------
// You must calculate and print:

// The length of rope needed to build a fence around it (which is the perimeter)

// The area of the rectangle to know how big the carpet must be.
