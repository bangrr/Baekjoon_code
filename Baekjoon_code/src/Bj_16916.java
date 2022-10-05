import java.io.*;

public class Bj_16916 {
	static int[] mkTable(String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
		
		int idx = 0;
		for (int i=1; i<n; i++) {
			while (idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if (pattern.charAt(i) == pattern.charAt(idx)) {
				idx += 1;
				table[i] = idx;
			}
		}
		return table;
	}
	
	static int KMP(String parent, String pattern) {
		int[] table = mkTable(pattern);
		
		int n1 = parent.length();
		int n2 = pattern.length();
		
		int idx = 0;	// 현재 대응되는 글자 수
		for (int i=0; i<n1; i++) {
			while (idx > 0 && parent.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if (parent.charAt(i) == pattern.charAt(idx)) {
				if (idx == n2-1) {
					idx = table[idx];
					return 1;
				} else {
					idx += 1;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		
		System.out.print(KMP(s, p));
	}
}