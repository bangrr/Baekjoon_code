import java.util.*;

public class Bj_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ArrayList<Integer> bars = new ArrayList<>();
		
		bars.add(64);
		while (x != 64) {
			int sum = 0;
			Collections.sort(bars);
			int sht = bars.get(0);
			bars.set(0, sht/2);
			for (int i=0; i<bars.size(); i++) {
				sum += bars.get(i);
			}
			if (sum < x) {
				bars.add(sht/2);
				sum += bars.get(bars.size()-1);
			}
			if (sum == x) {
				break;
			}
		}
		System.out.print(bars.size());
		sc.close();
	}
}