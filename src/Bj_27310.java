import java.io.*;

public class Bj_27310 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int a = s.length();
		int c = 0;
		
		for (int i=0; i<a; i++) {
			if (s.charAt(i) == '_') {
				c++;
			}
		}
		System.out.print(a+2+c*5);
	}
}