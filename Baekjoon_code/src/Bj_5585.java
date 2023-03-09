import java.io.*;
import java.util.*;

public class Bj_5585 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1000 - n;
		int ans = 0;
		
		if (c >= 500) {
			c -= 500;
			ans++;
		}
		if (c >= 100) {
			ans += c/100;
			c -= c/100*100;
		}
		if (c >= 50) {
			ans += c/50;
			c -= c/50*50;
		}
		if (c >= 10) {
			ans += c/10;
			c -= c/10*10;
		}
		if (c >= 5) {
			ans += c/5;
			c -= c/5*5;
		}
		if (c >= 1) {
			ans += c;
		}
		
		System.out.print(ans);
		sc.close();
	}
}