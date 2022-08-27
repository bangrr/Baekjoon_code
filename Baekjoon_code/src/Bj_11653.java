import java.io.*;

public class Bj_11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int i = 2;
		
		while (n > 1) {
			if (n % i == 0) {
				n /= i;
				sb.append(i).append("\n");
			} else {
				i++;
			}
		}
		System.out.println(sb);
	}
}