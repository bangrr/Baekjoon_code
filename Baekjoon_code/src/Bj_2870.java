import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_2870 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<BigInteger> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			for (int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if (c < 97) {
					sb.append(c);
				} else if (sb.length() != 0) {
					list.add(new BigInteger(sb.toString()));
					sb = new StringBuilder();
				}
			}
			if (sb.length() != 0) {
				list.add(new BigInteger(sb.toString()));
				sb = new StringBuilder();
			}
		}
		Collections.sort(list);
		for (BigInteger it : list) {
			sb.append(it).append("\n");
		}
	}
}