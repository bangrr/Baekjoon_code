import java.io.*;
import java.util.*;
 
public class Bj_5545 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());
 
        int max = c/a;
        for (int t : arr) {
            a += b;
            c += t;
            max = Math.max(max, c/a);
        }
        System.out.print(max);
	}
}