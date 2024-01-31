import java.io.*;
import java.util.*;
 
public class Bj_1812 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int sum = 0;
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum = sum + (i%2==1 ? arr[i] : -arr[i]);
        }
        int tmp = sum/2;
        sb.append(tmp).append("\n");
        for (int i=1; i<n; i++) {
            tmp = arr[i]-tmp;
            sb.append(tmp).append("\n");
        }
        System.out.print(sb);
	}
}