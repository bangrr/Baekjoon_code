import java.util.*;

public class Bj_24079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println(x+y < z+0.5 ? 1 : 0);
		sc.close();
	}
}