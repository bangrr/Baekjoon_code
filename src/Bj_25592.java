import java.util.*;

public class Bj_25592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(true) {
			int a = i*(i+1)/2;
			int b = (i+1)*(i+2)/2;
			int c = (i+2)*(i+3)/2;
			
			if (a <= n && n < b) {
				System.out.println(0);
				break;
			} else if(b <= n && n < c) {
				System.out.println(c-n);
				break;
			}
			i+=2;
		}
		sc.close();
	}
}