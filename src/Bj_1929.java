import java.util.*;

public class Bj_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> prime_nums = new ArrayList<>();
		// n까지 소수를 구하기 위해 배열 크기를 n+1로 선언
		// 소수는 false로 혼자 약속
		// 0과 1은 소수가 아니므로 제외
		boolean prime[] = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		
		for (int i=2; i*i<=n; i++) {
			if (prime[i]) {
				for (int j=i*i; j<=n; j+=i) {
					prime[j] = false;
				}
			}
		}
		// 소수를 List에 저장
		for (int i=2; i<=n; i++) {
			if (prime[i]) {
				prime_nums.add(i);
			}
		}
		// List에 있는 소수 출력
		for (int i=m; i<=n; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}