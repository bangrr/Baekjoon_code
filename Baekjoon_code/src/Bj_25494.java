import java.io.*;
import java.util.*;

public class Bj_25494 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		int a, b, c;
		
		for (int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			sb.append(Math.min(a, Math.min(b, c))).append("\n");
		}
		System.out.print(sb);
		sc.close();
	}
}