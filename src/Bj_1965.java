import java.io.*;
import java.util.*;
 
public class Bj_1965 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
		int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = 1;
            for (int j=0; j<i; j++) {
                if (arr[j][0] < arr[i][0]) {
                    arr[i][1] = Math.max(arr[j][1]+1, arr[i][1]);
                }
            }
            ans = Math.max(ans, arr[i][1]);
        }
		System.out.print(ans);
	}
}