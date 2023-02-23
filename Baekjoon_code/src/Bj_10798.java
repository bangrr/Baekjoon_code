import java.io.*;
import java.util.Arrays;

public class Bj_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] arr = new char[5][15];
		for (int i=0; i<5; i++) {
			Arrays.fill(arr[i], '.');
		}
		
		for (int i=0; i<5; i++) {
			String s = br.readLine();
			for (int j=0; j<s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for (int j=0; j<15; j++) {
			int cnt = 0;
			for (int i=0; i<5; i++) {
				if (arr[i][j] != '.') {
					sb.append(arr[i][j]);
				} else {
					cnt++;
				}
			}
			if (cnt == 5) {
				break;
			}
		}
		System.out.print(sb.toString());
	}
}