import java.io.*;
import java.util.*;

public class Bj_10821 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int c = 0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == ',') { c++; };
		}
		System.out.println(c+1);
	}
}