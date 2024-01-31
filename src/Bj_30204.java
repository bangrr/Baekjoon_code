import java.io.*;
import java.util.*;
 
public class Bj_30204 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        if (sum % a == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
		}
	}
}