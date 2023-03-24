import java.io.*;

public class Bj_10987 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int cnt = 0;
		for (int i=0; i<s.length(); i++) {
			char t = s.charAt(i);
			if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}