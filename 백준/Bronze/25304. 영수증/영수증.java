import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(bf.readLine());
    int n = Integer.parseInt(bf.readLine());
    int total = 0;
  
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      total += a * b;
    }
    if (x == total) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}