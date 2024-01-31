import java.io.*;
import java.util.*;

public class Bj_11944 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		String str = n.repeat(2016/n.length());
		System.out.println(str.substring(0, Math.min(Integer.parseInt(n)*n.length(), m)));
	}
}