import java.io.*;

public class Bj_4673 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		boolean[] chk = new boolean[10036];
		for (int i=1; i<=10000; i++) {
			chk[addEach(i)] = true;
			if (!chk[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	static int addEach(int n) {
		int sum = n;
		
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}