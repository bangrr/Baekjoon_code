import java.io.*;
import java.util.*;

public class Bj_5555 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int c = 0;
		while (n-- > 0) {
			if (br.readLine().repeat(10).contains(s)) c++;
		}
		System.out.print(c);
	}
}