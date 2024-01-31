import java.io.*;

public class Bj_10886 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		while(n-- > 0) {
			int c = Integer.parseInt(br.readLine());
			if (c > 0) {
				a++;
			} else {
				a--;
			}
		}
		if (a > 0) {
			System.out.print("Junhee is cute!");
		} else {
			System.out.print("Junhee is not cute!");
		}
	}
}