import java.io.*;
 
public class Bj_1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        String s = br.readLine();
        int[] a = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
        	a[i] = s.charAt(i) - '0';
        }
//        Arrays.sort(a);
        // 선택정렬 구현
        for (int i=0; i<s.length(); i++) {
        	int max = i;
        	for (int j=i+1; j<s.length(); j++) {
        		if (a[j] > a[max]) {
        			max = j;
        		}
        	}
        	if (a[i] < a[max]) {
        		int tmp = a[i];
        		a[i] = a[max];
        		a[max] = tmp;
        	}
        }
        
        for (int i=0; i<s.length(); i++) {
        	sb.append(a[i]);
        }
        System.out.print(sb.toString());
    }
}