import java.io.*;
import java.util.*;
 
public class Bj_20922 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int left = 0, right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (right=0; right<n; right++) {
            int a = Integer.parseInt(st.nextToken());
            arr[right] = a;
            map.put(a, map.getOrDefault(a, 0)+1);
            len++;
            if (map.get(a) > k) {
                while (true) {
                	map.put(arr[left], map.get(arr[left])-1);
                	len--;
                	if (arr[left] == a) {
                		left++;
                        break;
                    }
                	left++;
                }
            }
            ans = Math.max(ans, len);
        }
        System.out.print(ans);
	}
}