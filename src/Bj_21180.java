import java.io.*;
import java.util.*;
 
public class Bj_21180 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=0; j<n; j++) {
                if (i == j) continue;
                sum += arr[j];
            }
            if (arr[i] == sum) {
                System.out.print(sum);
                return;
            }
        }
        System.out.print("BAD");
	}
}