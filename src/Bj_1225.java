import java.io.*;
import java.util.*;

public class Bj_1225 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		long na = 0;
		long nb = 0;
		for (int i=0; i<a.length(); i++) {
			na += a.charAt(i)-48;
		}
		for (int i=0; i<b.length(); i++) {
			nb += b.charAt(i)-48;
		}
		System.out.print(na*nb);
	}
}