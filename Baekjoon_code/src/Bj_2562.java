import java.util.Scanner;

public class Bj_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int idx = 0;
		for (int i=0; i<9; i++) {
			int tmp = sc.nextInt();
			if (max < tmp) {
				max = tmp;
				idx = i+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(idx);
	}
}