import java.io.*;
import java.util.*;

public class Bj_30087 {
    static final String Algorithm = "204";
    static final String DataAnalysis = "207";
    static final String ArtificialIntelligence = "302";
    static final String CyberSecurity = "B101";
    static final String Network = "303";
    static final String Startup = "501";
    static final String TestStrategy = "105";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            sb.append(find(str)).append("\n");
        }
        System.out.print(sb);
    }

    private static String find(String str) {
        if (Objects.equals(str, "Algorithm")) {
            return Algorithm;
        } else if (Objects.equals(str, "DataAnalysis")) {
            return DataAnalysis;
        } else if (Objects.equals(str, "ArtificialIntelligence")) {
            return ArtificialIntelligence;
        } else if (Objects.equals(str, "CyberSecurity")) {
            return CyberSecurity;
        } else if (Objects.equals(str, "Network")) {
            return Network;
        } else if (Objects.equals(str, "Startup")) {
            return Startup;
        } else if (Objects.equals(str, "TestStrategy")) {
            return TestStrategy;
        } else {
            return "";
        }
    }
}