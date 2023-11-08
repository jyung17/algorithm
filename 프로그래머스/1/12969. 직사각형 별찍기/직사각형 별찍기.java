import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b; i++) {
          for (int j = 0; j < a; j++) {
            sb.append("*");
          }
          sb.append("\n");
        }
        System.out.println(sb);
    }
}