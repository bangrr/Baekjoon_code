import java.io.*;
import java.util.*;

public class Bj_29731 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		String a = "Never gonna give you up,"
				+ "Never gonna let you down,"
				+ "Never gonna run around and desert you,"
				+ "Never gonna make you cry,"
				+ "Never gonna say goodbye,"
				+ "Never gonna tell a lie and hurt you,"
				+ "Never gonna stop";
		
		while(n-- > 0) {
			String s = br.readLine();
			if (!a.contains(s)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}