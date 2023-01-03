import java.util.Scanner;

public class Solution {

        public static String getSmallestAndLargest(String s, int k) {


        String smallest = "";


        String largest = "";


        StringBuffer sb = new StringBuffer();


       for(int i=0; i<s.length()-(k-1); i++){


        sb.append(s.substring(i,i+k)+" ");


       }


       String str = sb.toString();


       String arr[] = str.split(" ");


       java.util.Arrays.sort(arr);


       smallest = arr[0];


       largest = arr[arr.length-1];


       return smallest + "\n" + largest;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
