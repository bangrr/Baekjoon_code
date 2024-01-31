import java.util.*;

public class Bj_25625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = y > x ? y%x : y+x;
		System.out.println(ans);
		sc.close();
	}
}