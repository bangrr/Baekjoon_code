import java.io.*;

public class Bj_1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = n;

		while (n-- > 0) {
			String s = br.readLine();
			int[] cnt = new int[26];
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i - 1) != s.charAt(i)) {
					if (cnt[s.charAt(i - 1) - 'a'] == 0) {
						cnt[s.charAt(i - 1) - 'a']++;
					} else {
						ans--;
						break;
					}
				}
				if (i == s.length()-1) {
					if (cnt[s.charAt(i) - 'a'] == 0) {
						cnt[s.charAt(i) - 'a']++;
					} else {
						ans--;
						break;
					}
				} 
			}
		}
		System.out.println(ans);
	}
}