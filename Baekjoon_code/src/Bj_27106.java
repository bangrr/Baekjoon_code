import java.io.*;
import java.util.*;

public class Bj_27106 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int p = 100-Integer.parseInt(br.readLine());
		sb.append(p/25).append(" ");
		p -= (p/25*25);
		sb.append(p/10).append(" ");
		p -= (p/10*10);
		sb.append(p/5).append(" ");
		p -= (p/5*5);
		sb.append(p/1);
		System.out.print(sb);
	}
}