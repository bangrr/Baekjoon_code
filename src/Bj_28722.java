import java.io.*;
import java.util.*;

public class Bj_28722 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		if (s.charAt(0) == s.charAt(s.length()-1)) {
			System.out.println("Lose");
		} else {
			System.out.println("Win");
		}
	}
}