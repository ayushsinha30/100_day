import java.util.Scanner;

public class quest1 {
    public static void
    countEvenSum(int l, int h,
                 int k)
    {
        int even_count = h / 2 - (l - 1) / 2;
        int odd_count = (h + 1) / 2 - l / 2;

        long even_sum = 1;
        long odd_sum = 0;

        // Iterate loop k times and update
        // even_sum & odd_sum using
        // previous values
        for (int i = 0; i < k; i++) {

            // Update the prev_even and
            // odd_sum
            long prev_even = even_sum;
            long prev_odd = odd_sum;

            // Even sum
            even_sum = (prev_even * even_count)
                    + (prev_odd * odd_count);

            // Odd sum
            odd_sum = (prev_even * odd_count)
                    + (prev_odd * even_count);
        }

        // Return even_sum
        System.out.println(even_sum);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        // Given ranges
        System.out.println("enter lower and higher range");
        int low = s.nextInt();
        int high = s.nextInt();

        // Length of permutation
        System.out.println("enter length of permutation");
        int R = s.nextInt();

        // Function call
        countEvenSum(low, high, R);
    }
}
