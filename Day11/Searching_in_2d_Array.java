import java.util.Scanner;

public class searchIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int a = sc.nextInt();
        System.out.print("Enter the column: ");
        int b = sc.nextInt();
        System.out.print("Enter the Number to search: ");
        int c = sc.nextInt();
        int i, j;
        int[][] number = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print("Enter the value: ");
                number[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                if (number[i][j] == c) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}
