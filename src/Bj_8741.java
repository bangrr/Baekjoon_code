import java.io.*;
import java.util.*;
 
public class Bj_8741 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int k = Integer.parseInt(br.readLine());
		sb.append("1".repeat(k)).append("0".repeat(k-1));
		System.out.print(sb);
	}
}