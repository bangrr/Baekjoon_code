import java.io.*;
import java.util.*;
 
public class Bj_22233 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        while (n-- > 0) {
            set.add(br.readLine());
        }
        while (m-- > 0) {
            String[] arr = br.readLine().split(",");
            for (String it : arr) {
                if (set.contains(it)) set.remove(it);
            }
            sb.append(set.size()).append("\n");
        }
        System.out.print(sb);
	}
}