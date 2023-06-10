import java.io.*;
import java.util.*;
 
public class Bj_28224 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while (n-- > 0) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.print(sum);
	}
}