import java.util.*;

public class Bj_10162 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0, b = 0, c = 0;
		
		if (t % 10 != 0) {
			System.out.print(-1);
		} else {
			a += t / 300;
			t %= 300;
			b += t / 60;
			t %= 60;
			c += t / 10;
			System.out.print(a + " " + b + " " + c);
		}
		sc.close();
	}
}