import java.util.*;

public class Bj_10804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] card = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int tmp;
		
		for (int i=0; i<10; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j=a; j<=(a+b)/2; j++) {
				tmp = card[j-1];
				card[j-1] = card[a+b-j-1];
				card[a+b-j-1] = tmp;
			}
		}
		for (int i=0; i<card.length; i++) {
			System.out.print(card[i] + " ");
		}
		sc.close();
	}
}