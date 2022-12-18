import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int min = 100;
    for (int i = 0; i < 7; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      if (a%2 != 0) {
        sum += a;
        if (a < min) {
          min = a;
        }
      }
    }
    if (sum > 0) {
      System.out.println(sum);
      System.out.println(min);
    } else {
      System.out.println("-1");
    }
  }
}