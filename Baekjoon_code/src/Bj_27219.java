import java.io.*;

public class Bj_27219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		sb.append("V".repeat(n/5)).append("I".repeat(n%5));
		System.out.print(sb);
	}
}