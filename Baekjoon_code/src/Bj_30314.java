import java.io.*;
import java.util.*;
 
public class Bj_30314 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long sum = 0;
		for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i=0; i<n/3; i++) {
            sum -= arr[n-(i+1)*3];
        }
        System.out.print(sum);
	}
}