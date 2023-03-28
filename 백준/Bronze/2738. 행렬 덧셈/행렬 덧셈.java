import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		
		for(int l=0; l<2; l++)	{
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					a[i][j] += Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++) {
				System.out.printf(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}