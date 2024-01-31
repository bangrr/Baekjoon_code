import java.io.*;
import java.util.*;
 
public class Bj_29261 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// 변수선언부
	static final int MAX = 3000001;
	static boolean[] notPrime = new boolean[MAX];
    static long[] table = new long[MAX];
	static int n;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		sieveOfEratosthenes();
		input();
		System.out.print(sb.toString());
	}
 
	static void sieveOfEratosthenes() {
		notPrime[0] = notPrime[1] = true;
 
		for (int i=2; i*i<MAX; i++) {
			if (!notPrime[i]) {
				for (int j=i*i; j<MAX; j+=i) {
					notPrime[j] = true;
				}
			}
		}
	}
 
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		setTable();
        System.out.print(table[n]);
	}
 
    static void setTable() {
        table[2] = table[3] = 1;
        for (int i=5; i<=n; i++) {
            if (!notPrime[i]) {
                for (int j=(i-1)/2; j<=i-3; j++) {
        			if (!notPrime[j] && !notPrime[i-1-j]) {
				        table[i] = table[j] + table[i-1-j] + 1;
				        break;
			        }
		        }
                //System.out.println(i +" : "+ table[i]);
            }
        }
    }
}