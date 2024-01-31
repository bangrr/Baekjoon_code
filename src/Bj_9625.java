import java.io.*;
import java.util.*;
 
public class Bj_9625 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        long a=1, b=0, ta=0, tb=0;
        for (int i=1; i<=n; i++) {
            ta = a;
            tb = b;
            a = tb;
            b = ta+tb;
        }
        System.out.print(a +" "+ b);
	}
}