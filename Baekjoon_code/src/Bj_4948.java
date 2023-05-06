import java.io.*;
import java.util.*;

public class Bj_4948 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static boolean[] notPrime;
	static int a;
	static ArrayList<Integer> primeNums;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		eraPrime();
		input();
		System.out.println(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		while (true) {
			a = Integer.parseInt(br.readLine());
			if (a == 0) {
				break;
			}
			solve(a);
		}
	}
	
	// 출력부
	static void solve(int a) {
		primeNums = new ArrayList<>();
		// 소수를 List에 저장
		for (int i=a+1; i<=2*a; i++) {
			if (!notPrime[i]) {
				primeNums.add(i);
			}
		}
		sb.append(primeNums.size()).append("\n");
	}
	
	// 에라토스테네스의 체
	static void eraPrime() {
		int m = 123456*2;
		notPrime = new boolean[m+1];
		notPrime[0] = notPrime[1] = true;
		
		for (int i=2; i*i<=m; i++) {
			if (!notPrime[i]) {
				for (int j=i*i; j<=m; j+=i) {
					notPrime[j] = true;
				}
			}
		}
	}
}