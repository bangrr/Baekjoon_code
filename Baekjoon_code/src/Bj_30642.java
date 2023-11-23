import java.io.*;
import java.util.*;
 
public class Bj_30642 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        
        if (s.equals("annyong")) {
            if (k%2==1) System.out.print(k);
            else System.out.print(k-1>0?k-1:k+1);
        } else if (s.equals("induck")) {
            if (k%2==0) System.out.print(k);
            else System.out.print(k-1>0?k-1:k+1);
        }
	}
}