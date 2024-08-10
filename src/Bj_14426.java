import java.io.*;
import java.util.*;

public class Bj_14426 {

    public class TrieNode {

        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }
    }

    TrieNode root;

    public Bj_14426() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode node = current.children[c - 'a'];
            if (node == null) {
                node = new TrieNode();
                current.children[c - 'a'] = node;
            }
            current = node;
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode node = current.children[c - 'a'];
            if (node == null) {
                return false;
            }
            current = node;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Bj_14426 trie = new Bj_14426();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            trie.insert(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (trie.search(br.readLine())) cnt++;
        }

        System.out.print(cnt);
    }
}