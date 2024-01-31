import java.io.*;

public class Bj_27541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		if (s.charAt(n-1) == 'G') {
			sb.append(s.substring(0, n-1));
		} else {
			sb.append(s).append("G");
		}
		System.out.print(sb.toString());
	}
}