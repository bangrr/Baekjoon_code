import java.util.*;
 
public class Bj_4299 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sub = sc.nextInt();
        if(sum<sub) {
            System.out.print(-1);
            return;
        }
        int a2 = sum+sub;
        int b2 = Math.abs(sum-sub);
        if(a2%2==0 && b2%2==0) {
            System.out.print(a2/2+" "+b2/2);
        } else {
            System.out.print(-1);
        }
	}
}