import java.io.*;
import java.util.*;

public class Bj_28295 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int a = 0;
		char[] d = {'N', 'E', 'S', 'W'};
		for (int i=0; i<10; i++) {
			a += Integer.parseInt(br.readLine());
		}
		System.out.print(d[a%4]);
	}
}