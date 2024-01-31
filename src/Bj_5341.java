import java.io.*;
import java.util.*;

public class Bj_5341 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0) {
			System.out.println(n*(n+1)/2);
		}
		sc.close();
	}
}