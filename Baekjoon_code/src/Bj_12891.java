import java.io.*;
import java.util.*;

public class Bj_12891 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		char[] str = br.readLine().toCharArray();
		int[] chk = new int[4]; // 비밀번호 체크
		int[] cur = new int[4]; // 현재상태 배열
		int cnt = 0; // 비밀번호 만족하는 문자 갯수
		int ans = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			chk[i] = Integer.parseInt(st.nextToken());
			if (chk[i] == 0) { // 만족해야 하는 문자의 갯수가 0일때
				cnt++; // 부분문자열에 있든 없든 만족하기 때문에 cnt++
			}
		}
		
		for (int i=0; i<p; i++) { // 첫 부분 문자열 입력
			if (str[i] == 'A') {
				cur[0]++;
				if (chk[0] == cur[0]) {
					cnt++;
				}
			} else if (str[i] == 'C') {
				cur[1]++;
				if (chk[1] == cur[1]) {
					cnt++;
				}
			} else if (str[i] == 'G') {
				cur[2]++;
				if (chk[2] == cur[2]) {
					cnt++;
				}
			} else if (str[i] == 'T') {
				cur[3]++;
				if (chk[3] == cur[3]) {
					cnt++;
				}
			}
		}
		if (cnt == 4) { // 4개 문자 모두 만족하면 ans++
			ans++;
		}
		
		for (int i=0; i<s-p; i++) { // 슬라이딩 윈도우 시작
			if (str[i] == 'A') { // 나갈 문자 확인 후 처리
				if (chk[0] == cur[0]) {
					cnt--;
				}
				cur[0]--;
			} else if (str[i] == 'C') {
				if (chk[1] == cur[1]) {
					cnt--;
				}
				cur[1]--;
			} else if (str[i] == 'G') {
				if (chk[2] == cur[2]) {
					cnt--;
				}
				cur[2]--;
			} else if (str[i] == 'T') {
				if (chk[3] == cur[3]) {
					cnt--;
				}
				cur[3]--;
			}
			
			if (str[p+i] == 'A') { // 들어올 문자 확인 후 처리
				cur[0]++;
				if (chk[0] == cur[0]) {
					cnt++;
				}
			} else if (str[p+i] == 'C') {
				cur[1]++;
				if (chk[1] == cur[1]) {
					cnt++;
				}
			} else if (str[p+i] == 'G') {
				cur[2]++;
				if (chk[2] == cur[2]) {
					cnt++;
				}
			} else if (str[p+i] == 'T') {
				cur[3]++;
				if (chk[3] == cur[3]) {
					cnt++;
				}
			}
			
			if (cnt == 4) { // 4개 문자 모두 만족하면 ans++
				ans++;
			}
		}
		
		System.out.print(ans);
	}
}

/*

시간 제한 2초, 메모리 제한 512MB

p와 s의 길이가 1,000,000 으로 매우 크기 때문에
O(n)의 시간 복잡도 알고리즘으로 문제를 해결해야 한다.
이 때 부분 문자열의 길이가 p이므로
슬라이딩 윈도우의 개념을 이용하면 문제를 쉽게 해결할 수 있다.

잘못 생각해서 슬라이딩 윈도우 반복문 안에서 str[i] == str[p+i] 처럼 입출력 문자가 같을때
당연히 값이 올라가겠지 하는 ans++ 혹은 아무 변화 없겠지 하는 break 으로 처리했었는데 다 틀렸다.
(ans++ 이나 break 둘 중 하나로만 하면 틀리는 건 확인했음) 
다시 생각해보니까 chk[] 배열의 값이 0이냐 아니냐에 따라서 또 조건처리를 해줘야 하는 것 같아서
그냥 해당 if 문을 지우고 새로 들어오고 나가는 문자에 대해서 다 체크를 하는 방향으로 했다.

*/