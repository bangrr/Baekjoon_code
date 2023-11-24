import java.io.*;
import java.util.*;
 
public class Bj_9342 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            sb.append(s.matches("^([A-F]?)A+F+C+$([A-F]?)") ? "Infected!" : "Good").append("\n");
        }
        System.out.print(sb);
	}
}