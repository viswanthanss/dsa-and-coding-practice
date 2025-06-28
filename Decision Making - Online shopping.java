import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Flipkart inputs
        int fp = sc.nextInt();      // price
        int fd = sc.nextInt();      // discount
        int fs = sc.nextInt();      // shipping

        // Snapdeal inputs
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();

        // Amazon inputs
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();

        // Calculate final prices
        int flipkartPrice = (fp - (fp * fd / 100)) + fs;
        int snapdealPrice = (sp - (sp * sd / 100)) + ss;
        int amazonPrice = (ap - (ap * ad / 100)) + as;

        // Print all three prices
        System.out.println("In Flipkart: Rs." + flipkartPrice);
        System.out.println("In Snapdeal: Rs." + snapdealPrice);
        System.out.println("In Amazon: Rs." + amazonPrice);

        // Decide best option with priority: Flipkart > Snapdeal > Amazon
        if (flipkartPrice <= snapdealPrice && flipkartPrice <= amazonPrice) {
            System.out.println("Choose Flipkart");
        } else if (snapdealPrice <= flipkartPrice && snapdealPrice <= amazonPrice) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}



---------------------------------------------------------------------------------------------------

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Flipkart inputs
        int fp = sc.nextInt();
        int fd = sc.nextInt();
        int fs = sc.nextInt();

        // Snapdeal inputs
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();

        // Amazon inputs
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();

        // Calculate final prices
        int flipkartPrice = (fp - (fp * fd / 100)) + fs;
        int snapdealPrice = (sp - (sp * sd / 100)) + ss;
        int amazonPrice = (ap - (ap * ad / 100)) + as;

        // Print all prices
        System.out.println("In Flipkart: Rs." + flipkartPrice);
        System.out.println("In Snapdeal: Rs." + snapdealPrice);
        System.out.println("In Amazon: Rs." + amazonPrice);

        // Determine minimum price
        int min = Math.min(flipkartPrice, Math.min(snapdealPrice, amazonPrice));

        // Apply tie-breaking priority
        if (flipkartPrice == min) {
            System.out.println("Choose Flipkart");
        } else if (snapdealPrice == min) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}




import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Flipkart inputs
        int fp = sc.nextInt();      // price
        int fd = sc.nextInt();      // discount
        int fs = sc.nextInt();      // shipping

        // Snapdeal inputs
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();

        // Amazon inputs
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();

        // Calculate final prices
        int flipkartPrice = (fp - (fp * fd / 100)) + fs;
        int snapdealPrice = (sp - (sp * sd / 100)) + ss;
        int amazonPrice = (ap - (ap * ad / 100)) + as;

        // Print all three prices
        System.out.println("In Flipkart: Rs." + flipkartPrice);
        System.out.println("In Snapdeal: Rs." + snapdealPrice);
        System.out.println("In Amazon: Rs." + amazonPrice);

        // Find the minimum price
        int min = Math.min(flipkartPrice, Math.min(snapdealPrice, amazonPrice));

        // Handle tie using priority: Flipkart > Snapdeal > Amazon
        if (flipkartPrice == min) {
            System.out.println("Choose Flipkart");
        } else if (snapdealPrice == min) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}


