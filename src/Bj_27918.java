import java.io.*;

public class Bj_27918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int d = 0;
		int p = 0;
		while (n-- > 0) {
			char c = br.readLine().charAt(0); 
			if (c == 'D') {
				d++;
			} else if (c == 'P') {
				p++;
			}
			if (Math.abs(d-p) == 2) {
				break;
			}
		}
		System.out.print(d + ":" + p);
	}
}