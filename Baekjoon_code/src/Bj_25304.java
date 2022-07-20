import java.util.*;

public class Bj_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int n=sc.nextInt(); n>0; n--) {
			x = x - sc.nextInt()*sc.nextInt();
		}
		System.out.print(x==0 ? "Yes" : "No");
		sc.close();
	}
}