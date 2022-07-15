import java.util.Scanner;

public class Bj_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		int m = 1234567891;
//		BigInteger m = new BigInteger("1234567891");
//		BigInteger h = new BigInteger(s);
		int sum=0;
		
		for (int i=0; i<l; i++) {
			sum = (int)(sum + (s.charAt(i)-96)*Math.pow(31, i));
		}
		System.out.println(sum%m);
//		System.out.println(h.mod(m));
		sc.close();
	}
}


// 지금은 Small 5까지만 되는 코드임
// 이거를 50까지 가져가려면 BigInteger 사용해야 될 것 같은데...