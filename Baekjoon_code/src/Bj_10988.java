import java.io.*;

public class Bj_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.print(0);
				return;
			}
			i++;
			j--;
		}
		System.out.print(1);
	}
}