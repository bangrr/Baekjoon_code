import java.io.*;

public class Bj_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dl = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6,
				7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10
		};
		String s = br.readLine();
		
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			sum += dl[s.charAt(i)-'A'];
		}
		System.out.println(sum);
	}
}