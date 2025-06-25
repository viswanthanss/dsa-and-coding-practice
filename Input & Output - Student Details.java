import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();
        char grade = sc.next().charAt(0);

        // Truncate CGPA to 2 decimal places
        float truncatedCgpa = (int)(cgpa * 100) / 100.0f;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", truncatedCgpa);
        System.out.println("Grade: " + grade);
    }
}


/*
cgpa = 8.6467
cgpa * 100 = 864.67
(int)(cgpa * 100) = 864
864 / 100.0 = 8.64  ✅


float truncatedCgpa = (int)(cgpa * 100) / 100.0f;

(int)(cgpa * 100): This casts the float to an int, removing everything after the decimal.
(int)(864.67) = 864 ✅
*/
