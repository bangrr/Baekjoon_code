import java.io.*;
import java.util.*;

public class Bj_27959 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if (100*n >= m) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		sc.close();
	}
}