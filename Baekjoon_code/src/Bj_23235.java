import java.io.*;

public class Bj_23235 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 1;
		
		while (true) {
			if (br.readLine().equals("0")) {
				break;
			}
			sb.append("Case " + n++ + ": Sorting... done!\n");
		}
		System.out.print(sb);
	}
}