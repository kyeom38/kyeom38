import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String eo = null;
        if (n%2==0)
        {
            eo = " is even";
        }
        else 
        {
            eo = " is odd";
        }
        System.out.print(n + eo);
    }
}