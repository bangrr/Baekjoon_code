import java.io.*;
import java.util.*;

public class Bj_6679 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		for (int i=2992; i<=9999; i++) {
			String ten = Integer.toString(i);
			String das = Integer.toString(i, 12);
			String hex = Integer.toString(i, 16);
			int tt = 0;
			int dd = 0;
			int hh = 0;
			
			for (int j=0; j<ten.length(); j++) {
				tt += (ten.charAt(j)-'0');
			}
			for (int j=0; j<das.length(); j++) {
				char d = das.charAt(j);
				dd += (d > '9' ? d-'a'+10 : d-'0');
			}
			for (int j=0; j<hex.length(); j++) {
				char h = hex.charAt(j);
				hh += (h > '9' ? h-'a'+10 : h-'0');
			}
			
			if (tt == dd && dd == hh) {
				sb.append(ten).append("\n");
			}
		}
		System.out.print(sb);
	}
}