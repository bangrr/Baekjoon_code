import java.io.*;
import java.util.*;

public class Bj_6996 {
    private static boolean solveAnagrams(String first, String second ) {
    	char[] fArr = first.toCharArray();
    	char[] sArr = second.toCharArray();
    	
    	if (fArr.length == sArr.length) {
    		Arrays.sort(fArr);
    		Arrays.sort(sArr);
    		for (int i=0; i<fArr.length; i++) {
    			if (fArr[i] != sArr[i]) {
    				return false;
    			}
    		}
    		return true;
    	} else {
    		return false;
    	}
    }

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {
        	st = new StringTokenizer(br.readLine());
            String first = st.nextToken().toLowerCase();
            String second = st.nextToken().toLowerCase();

            sb.append(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams.")).append("\n");
        }
        System.out.print(sb.toString());
    }
}