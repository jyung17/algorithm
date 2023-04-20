import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
          result += a.charAt(i) < 97 ? (a.charAt(i)+"").toLowerCase() : (a.charAt(i)+"").toUpperCase();
        }
        System.out.println(result);
    }
}