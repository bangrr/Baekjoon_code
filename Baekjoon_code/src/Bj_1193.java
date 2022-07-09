import java.util.Scanner;

public class Bj_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int i=1;
		while ((i*(i+1)/2) < x) {
			i++;
		}
		if (i%2 == 0) {
			--i;
			System.out.println((x-(i*(i+1)/2)) + "/" + ((++i*(i+1)/2)-x+1));
		} else {
			System.out.println(((i*(i+1)/2)-x+1) + "/" + (x-(--i*(i+1)/2)));
		}
		sc.close();
	}
}
