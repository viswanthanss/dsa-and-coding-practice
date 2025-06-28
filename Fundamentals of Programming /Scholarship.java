import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int year = sc.nextInt();
        int income = sc.nextInt();
        int arrears = sc.nextInt();
        float marks = sc.nextFloat();
        float attendance = sc.nextFloat();

        // Check basic eligibility
        boolean ageOK = age >= 18 && age < 21;
        boolean yearOK = year >= 2021;
        boolean arrearsOK = arrears <= 2;
        boolean incomeOK = income <= 200000;
        boolean marksOK = marks >= 60;
        boolean attendanceOK = attendance >= 80;

        boolean allNormalCriteria = ageOK && yearOK && arrearsOK && incomeOK && marksOK && attendanceOK;

        // Check relaxation 1 (more than 2 arrears but scored high + high attendance)
        boolean relaxedArrearOK = (arrears > 2) && (marks >= 80) && (attendance >= 90);
        boolean relaxedEligible = ageOK && yearOK && incomeOK && relaxedArrearOK;

        // Check partial eligibility (income > 2L but < 2.5L) and all other normal conditions are met
        boolean partialIncome = income > 200000 && income < 250000;
        boolean partialEligible = partialIncome && ageOK && yearOK && arrearsOK && marksOK && attendanceOK;

        if (allNormalCriteria || relaxedEligible) {
            System.out.println("Eligible");
        } else if (partialEligible) {
            System.out.println("Partially Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
