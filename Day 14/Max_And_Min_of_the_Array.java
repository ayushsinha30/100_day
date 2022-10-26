package dsa;

import java.util.Scanner;

public class Find_minimum_and_maximum_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int a = sc.nextInt();
        int c = 0;
        int[] arr = new int[a + 1];
        int q = 8989898;
        for (int i = 0; i <= a; i++) {
            System.out.print("Enter the value of Array: ");
            arr[i] = sc.nextInt();
            if (c < arr[i]) {
                c = arr[i];
            }
            if (q > arr[i]) {
                q = arr[i];
            }
        }
        System.out.println("The max value is: " + c);
        System.out.print("The min value is: " + q);
        sc.close();
    }
}
