import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = 0; //30초로 나누기 + 1 * 10;
    int m = 0; //60초로 나누기 + 1 * 15;
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(st.nextToken());
      y += ((x / 30) + 1) * 10;
      m += ((x / 60) + 1) * 15;
    }
  
    if (y == m) {
      System.out.println("Y M " + y);
    } else if (y > m) {
      System.out.println("M " + m);
    } else if (y < m) {
      System.out.println("Y " + y);
    }
  }
}