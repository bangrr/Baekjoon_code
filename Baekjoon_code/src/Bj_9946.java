import java.io.*;
import java.util.*;

public class Bj_9946 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int cnt = 1;
		while (true) {
			String a = br.readLine();
			if ("END".equals(a)) {
				break;
			}
			char[] asis = a.toCharArray();
			Arrays.sort(asis);
			
			String t = br.readLine();
			char[] tobe = t.toCharArray();
			Arrays.sort(tobe);
			
			boolean chk = true;
			if (asis.length != tobe.length) {
				chk = false;
			} else {
				for (int i=0; i<asis.length; i++) {
					if (asis[i] != tobe[i]) {
						chk = false;
						break;
					}
				}
			}
			
			sb.append("Case ").append(cnt).append(": ");
			if (chk) {
				sb.append("same");
			} else {
				sb.append("different");
			}
			sb.append("\n");
			cnt++;
		}
		System.out.print(sb.toString());
	}
}