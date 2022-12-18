import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[5];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      sum += a;
      arr[i] = a;
    }
    System.out.println(sum/arr.length);
    Arrays.sort(arr);
    System.out.println(arr[2]);
  }
}