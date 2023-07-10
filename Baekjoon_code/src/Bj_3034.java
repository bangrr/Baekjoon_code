import java.util.*;

public class Bj_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		while(n-- > 0) {
			if (sc.nextInt() > Math.sqrt(w*w + h*h)) {
				System.out.println("NE");
			} else {
				System.out.println("DA");
			}
		}
	}
}