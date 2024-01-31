import java.io.*;

public class Bj_4470 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			sb.append(i+1 + ". " + s + "\n");
		}
		System.out.println(sb);
	}
}