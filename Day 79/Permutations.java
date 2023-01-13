import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.next();
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)==52 && str.charAt(i)==53){

            }
        }
        Permutations permutation = new Permutations();
        permutation.permute(str, 0, len - 1);
    }
    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
