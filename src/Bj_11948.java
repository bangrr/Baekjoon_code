import java.io.*;
import java.util.*;

public class Bj_11948 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] abcd = new int[4];
		abcd[0] = sc.nextInt();
		abcd[1] = sc.nextInt();
		abcd[2] = sc.nextInt();
		abcd[3] = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		Arrays.sort(abcd);
		System.out.print(abcd[1]+abcd[2]+abcd[3]+Math.max(e, f));
		sc.close();
	}
}