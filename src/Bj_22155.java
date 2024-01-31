import java.util.*;

public class Bj_22155 {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a<3&&b<2||a<2&&b<3) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.print(sb);
        sc.close();
	}
}