import java.io.*;

public class Bj_1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		for (int i=0; i<8; i++) {
			String s = br.readLine();
			for (int j=0; j<8; j++) {
				char t = s.charAt(j);
				if (t == 'F') {
					if (i % 2 == 0 && j % 2 == 0 && t == 'F') {
						cnt++;
					} else if (i % 2 == 1 && j % 2 == 1 && t == 'F') {
						cnt++;
					}
				}
			}
		}
		System.out.print(cnt);
	}
}