import java.io.*;
import java.util.*;

public class Bj_28248 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int p = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int a = p>c?500:0;
		System.out.print(p*50-c*10+a);
	}
}