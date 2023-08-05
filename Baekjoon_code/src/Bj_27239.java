import java.io.*;
import java.util.*;

public class Bj_27239 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		char[] ca = {'h', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		sb.append(ca[n%8]).append((n-1)/8+1);
		System.out.print(sb);
	}
}