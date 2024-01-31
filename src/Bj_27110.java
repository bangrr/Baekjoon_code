import java.io.*;
import java.util.*;

public class Bj_27110 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = 0;
		
		s += a < n ? a : n;
		s += b < n ? b : n;
		s += c < n ? c : n;
		System.out.println(s);
		sc.close();
	}
}