import java.io.*;
import java.util.*;

public class Bj_6778 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		if (a >= 3 && e <= 4) {
			System.out.println("TroyMartian");
		}
		if (a <= 6 && e >= 2) {
			System.out.println("VladSaturnian");
		}
		if (a <= 2 && e <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
}