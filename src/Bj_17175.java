import java.io.*;
import java.util.*;
 
public class Bj_17175 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+2];
 
        arr[0] = arr[1] = 1;
        for (int i=2; i<=n; i++) {
            arr[i] = (1 + arr[i-1] + arr[i-2]) % 1000000007;
        }
        System.out.print(arr[n]);
	}
}