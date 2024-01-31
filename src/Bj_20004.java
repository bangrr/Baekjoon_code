import java.io.*;
import java.util.*;
 
public class Bj_20004 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
            if (30%(i+1)==0) System.out.println(i);
        }
	}
}