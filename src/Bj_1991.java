import java.io.*;
import java.util.*;

public class Bj_1991 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static int[] lc, rc;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		preorder(1);
		sb.append("\n");
		inorder(1);
		sb.append("\n");
		postorder(1);
		sb.append("\n");
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		lc = new int[n+1];
		rc = new int[n+1];
		
		for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);
            if (l != '.') lc[c-65+1] = l-65+1;
            if (r != '.') rc[c-65+1] = r-65+1;
		}
	}
	
	static void preorder(int s) {
		sb.append((char)(s-1+'A'));
		if (lc[s] != 0) preorder(lc[s]);
		if (rc[s] != 0) preorder(rc[s]);
	}
	
	static void inorder(int s) {
		if (lc[s] != 0) inorder(lc[s]);
		sb.append((char)(s-1+'A'));
		if (rc[s] != 0) inorder(rc[s]);
	}
	
	static void postorder(int s) {
		if (lc[s] != 0) postorder(lc[s]);
		if (rc[s] != 0) postorder(rc[s]);
		sb.append((char)(s-1+'A'));
	}
}