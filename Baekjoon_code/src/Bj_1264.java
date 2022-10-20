import java.io.*;

public class Bj_1264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			s = s.toLowerCase();
			int cnt = 0;
			if (s.equals("#")) {
				break;
			}
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}