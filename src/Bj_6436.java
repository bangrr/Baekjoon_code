import java.util.*;

public class Bj_6436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			int s = sc.nextInt();
			if (s == 0) {
				break;
			}
		
			s = (int) Math.round(s / 2 * 1.5);
			int ans = s / (62 * 30000) + 1;
			System.out.println("File #" + i++);
			System.out.println("John needs " + ans + " floppies.\n");
		}
		sc.close();
	}
}