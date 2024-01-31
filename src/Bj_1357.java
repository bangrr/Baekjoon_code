import java.io.*;
import java.util.*;

public class Bj_1357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		System.out.print(rev(rev(x) + rev(y)));
	}
	
	static int rev(int p) {
		int ret = 0;
		
		while (p > 0) {
			ret = ret * 10 + p % 10;
			p = p / 10;
		}
		return ret;
	}
}