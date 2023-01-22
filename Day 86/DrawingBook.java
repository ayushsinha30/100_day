import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int mid = (n + 1) / 2;
        if(p < mid) {
            System.out.println(p / 2);
        } else {
            System.out.println((n - p) / 2);
        }
    }
}
