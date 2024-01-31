import java.io.*;
import java.util.*;

public class Bj_2864 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int amin = Integer.parseInt(String.valueOf(a).replaceAll("6", "5"));
		int bmin = Integer.parseInt(String.valueOf(b).replaceAll("6", "5"));
		int amax = Integer.parseInt(String.valueOf(a).replaceAll("5", "6"));
		int bmax = Integer.parseInt(String.valueOf(b).replaceAll("5", "6"));
		
		System.out.println((amin+bmin) + " " + (amax+bmax));
	}
}