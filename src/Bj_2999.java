import java.io.*;
import java.util.*;
 
public class Bj_2999 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
        int len = s.length();
		int m = 1;
        for (int i=(int)Math.sqrt(len); i>0; i--) {
            if (len % i == 0) {
                m = i;
                break;
            }
        }
 
		for (int i=0; i<m; i++) {
			for (int j=0; j<len; j+=m) {
                sb.append(s.charAt(j+i));
            }
		}
		System.out.print(sb);
	}
}