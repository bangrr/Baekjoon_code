import java.io.*;
import java.util.*;

public class Bj_29730 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> boj = new ArrayList<>();
		while (n-- > 0) {
			String s = br.readLine();
			if (s.length() > 7 && s.substring(0, 7).equals("boj.kr/")) {
				int seq = Integer.parseInt(s.substring(7, s.length()));
				if (seq >= 1 && seq <= 30000) {
					boj.add(seq);
				} else {
					list.add(s);
				}
			} else {
				list.add(s);
			}
		}
		
		Collections.sort(list, (a, b) -> 
		a.length() == b.length() ? a.compareTo(b) : a.length() < b.length() ? -1 : 1);
		for (String item : list) {
			sb.append(item).append("\n");
		}
		
		Collections.sort(boj);
		for (int b : boj) {
			sb.append("boj.kr/").append(b).append("\n");
		}
		System.out.println(sb);
	}
}