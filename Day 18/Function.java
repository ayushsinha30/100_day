import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class oddNumSum {
    public static void oddSum(int a, int sum) {

        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        System.out.println("sum of the odd numbers: " + sum);

    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        // int b = a ^ 2;
        // System.out.println(sum);
        oddSum(a, sum);
        // int c = oddSum(a, b);
        // System.out.println(c);
        sc.close();
    }
}
