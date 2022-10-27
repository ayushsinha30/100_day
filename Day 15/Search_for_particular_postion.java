package dsa;

import java.util.Scanner;

public class Kth_Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Postion: ");
        int c = sc.nextInt();
        int[] arr = new int[a + 1];
        // int q = 0;
        for (int i = 0; i <= a; i++) {
            System.out.print("Enter the value of Array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (arr[i] < arr[j]) {
                    int w = arr[i];
                    arr[i] = arr[j];
                    arr[j] = w;
                }
            }
        }
        System.out.println("The Kth Smallest Element is: " + arr[c]);
        sc.close();
    }
}
