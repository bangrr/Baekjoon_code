import java.io.*;
import java.util.*;

public class Bj_27961 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = 0;
		int c = 0;
		while (n > 0 && a < n) {
			if (a == 0) {
				a++;
				c++;
			} else {
				a *= 2;
				c++;
			}
		}
		System.out.println(c);
		sc.close();
	}
}