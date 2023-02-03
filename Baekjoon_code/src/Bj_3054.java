import java.io.*;

public class Bj_3054 {
	static StringBuilder sb = new StringBuilder();
	static String p1 = ".#.";
	static String p2 = "#.#";
	static String p3 = "#.";
	static String w1 = "..*.";
	static String w2 = ".*.*";
	static String w3 = "*.";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		draw1(s);
		draw2(s);
		draw3(s);
		draw2(s);
		draw1(s);
		
		System.out.print(sb);
	}
	
	static void draw1(String s) {
		for (int i=0; i<s.length(); i++) {
			if (i < 2 || i % 3 == 1) {
				sb.append(".").append(p1);
			} else if (i % 3 == 2) {
				sb.append(w1);
			} else if (i % 3 == 0) {
				sb.append(".").append(p1);
			}
		}
		sb.append(".\n");
	}
	
	static void draw2(String s) {
		for (int i=0; i<s.length(); i++) {
			if (i < 2 || i % 3 == 1) {
				sb.append(".").append(p2);
			} else if (i % 3 == 2) {
				sb.append(w2);
			} else if (i % 3 == 0) {
				sb.append(".").append(p2);
			}
		}
		sb.append(".\n");
	}
	
	static void draw3(String s) {
		for (int i=0; i<s.length(); i++) {
			if (i < 2 || i % 3 == 1) {
				sb.append("#.").append(s.charAt(i)).append(".");
			} else {
				sb.append("*.").append(s.charAt(i)).append(".");
			}
			if (i==s.length()-1) {
				if (i % 3 == 2) {
					sb.append("*");
				} else {
					sb.append("#");
				}
			}
		}
		sb.append("\n");
	}
}