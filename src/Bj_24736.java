import java.util.*;

public class Bj_24736 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vt = 6*sc.nextInt();
		int vf = 3*sc.nextInt();
		int vs = 2*sc.nextInt();
		int vp = sc.nextInt();
		int vc = 2*sc.nextInt();
		int vsum = vt+vf+vs+vp+vc;
		
		int ht = 6*sc.nextInt();
		int hf = 3*sc.nextInt();
		int hs = 2*sc.nextInt();
		int hp = sc.nextInt();
		int hc = 2*sc.nextInt();
		int hsum = ht+hf+hs+hp+hc;
		
		System.out.println(vsum + " " + hsum);
		sc.close();
	}
}