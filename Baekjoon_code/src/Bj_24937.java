import java.io.*;
import java.util.*;
 
public class Bj_24937 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine())%10;
        String s = "SciComLove";
		System.out.print(s.substring(n));
        System.out.print(s.substring(0, n));
	}
}