import java.io.*;

public class Bj_27332 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		if (n + 4*m > 31) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
}