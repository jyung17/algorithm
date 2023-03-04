import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
  
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
  
    for (int i = 0; i < n; i++) {
      arr[i] = i+1;
    }
  
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(bf.readLine());
      int I = Integer.parseInt(st.nextToken());
      int J = Integer.parseInt(st.nextToken());
      
      int tmp = arr[I-1];
      arr[I-1] = arr[J-1];
      arr[J-1] = tmp;
    }
  
    for (int i : arr) {
      System.out.printf(i + " ");
    }
  }
}