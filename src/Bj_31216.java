import java.io.*;
import java.util.*;
 
public class Bj_31216 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
		int n = 400000;
		// n까지 소수를 구하기 위해 배열 크기를 n+1로 선언
		boolean prime[] = new boolean[n+1];
		ArrayList<Integer> prime_nums = new ArrayList<>();
 
		// 소수는 false로 혼자 약속
		// 0과 1은 소수가 아니므로 제외
		prime[0] = prime[1] = true;
 
		for (int i=2; i*i<=n; i++) {
			if (!prime[i]) {
				for (int j=i*i; j<=n; j+=i) {
					prime[j] = true;
				}
			}
		}
        
		// 소수를 List에 저장
		for (int i=2; i<=n; i++) {
			if (!prime[i]) {
				prime_nums.add(i);
			}
		}
 
        ArrayList<Integer> sss = new ArrayList<>();
        for (int i=0; i<prime_nums.size(); i++) {
            if (!prime[i+1]) {
                sss.add(prime_nums.get(i));
            }
        }
        
        while (t-- > 0) {
            sb.append(sss.get(Integer.parseInt(br.readLine())-1)).append("\n");
        }
        System.out.print(sb);
	}
}