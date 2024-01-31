import java.io.*;
import java.util.*;

public class Bj_30924 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> aList = new ArrayList<>();
		for (int i=1; i<=10000; i++) {
			aList.add(i);
		}
		Collections.shuffle(aList);
		
		LinkedList<Integer> bList = new LinkedList<>();
		for (int i=1; i<=10000; i++) {
			bList.add(i);
		}
		Collections.shuffle(bList);
		
		int sum = 0;
		for (int a = 0; a < 9999; a++) {
			System.out.println("? A " + aList.get(a));

			int resp = sc.nextInt();

			if (resp == 1) {
				sum += aList.get(a);
				break;
			}
		}
		
		for (int b = 0; b < 9999; b++) {
			System.out.println("? B " + bList.get(b));
			
			int resp = sc.nextInt();

			if (resp == 1) {
				sum += bList.get(b);
				break;
			}
		}
		System.out.println("! " + sum);
	}
}