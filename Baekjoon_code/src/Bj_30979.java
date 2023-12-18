import java.io.*;
import java.util.*;
 
public class Bj_30979 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) n-=Integer.parseInt(st.nextToken());
        System.out.print(n>0?"Padaeng_i Cry":"Padaeng_i Happy");
	}
}