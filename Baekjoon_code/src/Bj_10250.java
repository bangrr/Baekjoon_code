import java.util.Scanner;

public class Bj_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int room = (n%h==0 ? h : n%h)*100 + (n-1)/h + 1;
			System.out.println(room);
		}
		sc.close();
	}
}
