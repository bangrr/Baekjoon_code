import java.io.*;
import java.util.*;

public class Bj_2960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// false 이면 prime 인거, true 이면 notPrime
		boolean[] isNotPrime = new boolean[N+1];
		isNotPrime[0] = isNotPrime[1] = true;
		
		for (int i=2; i<=N; i++) {
			if (!isNotPrime[i]) {
				K--;
				if (K == 0) {
					System.out.print(i);
					return;
				}
				for (int j=i*i; j<=N; j+=i) {
					if (!isNotPrime[j]) {
						isNotPrime[j] = true;
						K--;
						if (K == 0) {
							System.out.print(j);
							return;
						}
					}
				}
			}
		}
	}
}