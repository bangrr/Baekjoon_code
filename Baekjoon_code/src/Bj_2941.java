import java.util.*;

public class Bj_2941 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("c-", "1").replace("c=", "2")
            .replace("dz=", "3").replace("d-", "4")
            .replace("lj", "5").replace("nj", "6")
            .replace("s=", "7").replace("z=", "8");
        System.out.print(s.length());
        sc.close();
	}
}