import java.io.*;

public class Bj_23795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		while(true) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == -1) {
				break;
			}
			sum += tmp;
		}
		System.out.print(sum);
	}
}