import java.util.Scanner;

public class BaseConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();	// 0 ~ 99
		int w = sc.nextInt();
		int t;
		int sum;
		
		sc.close();
		
		char[] cArr = n.toCharArray();
		System.out.println(cArr[cArr.length-1]);
		
		for (t=cArr[cArr.length-1]-'0'+1; t<w; t++) {
			sum = 0;
			System.out.println(t);
			for (int i=0; i<n.length(); i++) {
				sum = sum + (int)Math.pow(t, n.length()-i-1)*(n.charAt(i)-'0');
				if (sum > w) {
					break;
				}
			}
			if (sum == w) {
				System.out.println(t);
				break;
			}
		}
		if (t == w) {
			System.out.println(0);
		}
	}
}

/*
문제
민국이가 IQ검사를 했는데 자기 생각보다 낮은 n값이 나왔다 (0 <= n < 100)
너무 낮아서 친구들한테 무시당할까봐 원하는 IQ값 W가 되도록 n옆에 작게 (t)라고 진법표시를 하려고 하는데
몇으로 해야 원하는 W값이 될 지 모르겠다고 한다. 필요할 때마다 사용할 수 있도록 민국이를 도와주자.

입력
첫째 줄에 원래 값인 n과 원하는 값인 w를 공백 하나를 사이에 두고 입력한다.

출력
조건을 만족하는 진법 t를 출력한다. 만족하는 t진법이 없을 시에는 0을 출력한다.

예제 입력
48 100

예제 출력
23
*/