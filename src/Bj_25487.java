import java.io.*;
import java.util.*;

public class Bj_25487 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();	// t (1 ~ 600000)
		int a = 0, b = 0, c = 0;
		
		for (int i=0; i<t; i++) {	// t만큼의 줄에 세 정수 a, b, c (1 ~ 100000)
			StringTokenizer st = new StringTokenizer(br.readLine());
			String nextToken = st.nextToken();
			System.out.println(nextToken);
			a = Integer.parseInt(nextToken);
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			sb.append(Math.min(a, Math.min(b, c))).append("\n");
		}
		System.out.print(sb);
		sc.close();
	}
}

/*

import java.io.*;
import java.util.*;

public class Bj_icpc_h {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();	// t (1 ~ 600000)
		int a = 0, b = 0, c = 0;
		
		for (int i=0; i<t; i++) {	// t만큼의 줄에 세 정수 a, b, c (1 ~ 100000)
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			sb.append(Math.min(a, Math.min(b, c))).append("\n");
		}
		System.out.print(sb);
		sc.close();
	}
}

*/