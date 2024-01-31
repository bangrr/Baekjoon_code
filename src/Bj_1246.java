import java.io.*;
import java.util.*;
 
public class Bj_1246 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans = 0;
        int max = 0;
        Integer[] arr = new Integer[m];
        for (int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        int p = 1000000;
        for (int i=0; i<m; i++) {
            if (p == arr[i]) continue;
            p = arr[i];
            int sum = 0;
            for (int j=0; j<Math.min(n, m); j++) {
                if (p > arr[j]) break;
                sum += p;
            }
            if (sum >= max) {
                ans = p;
                max = Math.max(max, sum);
            }
        }
        System.out.print(ans + " " + max);
// 10 8 7 2
// n이 m보다 작을수도.. Math.min(n,m)
// 최대수익이 같을경우 더 낮은가격
	}
}