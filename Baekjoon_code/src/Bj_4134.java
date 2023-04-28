import java.io.*;

public class Bj_4134 {
	/*

	최대 long 40억 보다 크거나 같은 소수 중 가장 작은 소수 찾기
	boolean 40억개 = 40억바이트 ?? 이건 아니다

	그럼 p = n 부터 +1 씩해서
	소수인지 체크한다
	소수다? 메인함수에 리턴
	소수가 아니다? 다음수 소수체크

	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			long n = Long.parseLong(br.readLine());
			sb.append(findLargerPrime(n)).append("\n");
		}
		System.out.print(sb.toString());
	}

	private static long findLargerPrime(long n) {
		if (n == 0 || n == 1) {
			return 2;
		}
		
		long p = n;
		
		while (!isPrime(p)) {
			p++;
		}
		return p;
	}
	
	private static boolean isPrime(long p) {
		long prime = p;
		
		for (long i=2; i*i <= prime; i++) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}
}