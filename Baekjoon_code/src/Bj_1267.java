import java.util.*;

public class Bj_1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n];
		int ysum = 0;
		int msum = 0;
		for (int i=0; i<n; i++) {
			t[i] = sc.nextInt();
			
			ysum += (t[i]/30)*10 + 10;
			
			msum += (t[i]/60)*15 + 15; 
		}
		if (ysum < msum) {
			System.out.print("Y " + ysum);
		} else if (ysum > msum) {
			System.out.print("M " + msum);
		} else {
			System.out.print("Y M " + ysum);
		}
		sc.close();
	}
}