import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n;
        String change = "";
        for(int i = 0; i < a.length() ; i++)
        {
            n = (int)a.charAt(i);
            if (n>64 && n<91)
            {
                change += (char)(n+32);
            }
            else if (n >96 && n<123)
            {
                change += (char)(n-32);
            }
        }
        System.out.print(change);
    }
}