import java.io.*;
import java.util.*;
 
public class Bj_21869 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        sb.append(n > 2 ? n*2-2 : n).append("\n");
        for (int i=1; i<=n; i++) {
            sb.append(i).append(" 1\n");
        }
        for (int i=2; i<n; i++) {
            sb.append(i).append(" ").append(n).append("\n");
        }
        System.out.print(sb);
	}
}