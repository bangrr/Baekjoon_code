import java.util.*;

public class Bj_19602 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int h = s + 2*m + 3*l;
		
		System.out.print(h >= 10 ? "happy" : "sad");
		sc.close();
	}
}