import java.io.*;
import java.util.*;

public class Bj_28432 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();
		int idx = 0;
		for (int i=0; i<n; i++) {
			arr.add(br.readLine());
			if ("?".equals(arr.get(i))) {
				idx = i;
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		String[] b = new String[m];
		for (int i=0; i<m; i++) {
			b[i] = br.readLine();
		}
		
		if (n == 1 && m == 1) {
			System.out.println(b[0]);
			return;
		}
		
		char l = '\0', r = '\0';
		if (idx == 0) {
			r = arr.get(idx+1).charAt(0);
		} else if (idx == n-1) {
			l = arr.get(idx-1).charAt(arr.get(idx-1).length()-1);
		} else {
			l = arr.get(idx-1).charAt(arr.get(idx-1).length()-1);
			r = arr.get(idx+1).charAt(0);
		}
		
		for (int i=0; i<m; i++) {
			if (!arr.contains(b[i]) && (l == '\0' || l == b[i].charAt(0)) && (r == '\0' || r == b[i].charAt(b[i].length()-1))) {
				System.out.println(b[i]);
			}
		}
	}
}