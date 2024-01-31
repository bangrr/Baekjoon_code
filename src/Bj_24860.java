import java.util.*;

public class Bj_24860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long kn = sc.nextInt()*sc.nextInt();
		long tn = sc.nextInt()*sc.nextInt();
		long hn = sc.nextInt()*sc.nextInt()*sc.nextInt();
		
		long sum = kn*hn + tn*hn;
		System.out.println(sum);
		sc.close();
	}
}