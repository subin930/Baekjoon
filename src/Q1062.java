import java.util.*;
import java.io.*;

public class Q1062 {
    public static int n;
    public static int k;
    public static String[] words;
    public static boolean[] visited = new boolean[26];
    public static HashSet<Integer> results = new HashSet<>();
    public static int max = Integer.MIN_VALUE;

    public static void Backtracking(int idx, int cntAlphabet) {
        if(cntAlphabet == k - 5) {
            //알파벳 선택 완료, 읽을 수 있는 단어 개수 세기
            int cnt = 0;
            for(String str: words) {
                boolean readable = true;
                for(int i = 0; i < str.length(); ++i) {
                    if(!visited[str.charAt(i) - 'a']){
                        readable = false;
                       break;
                    }
                }
                if(readable) ++cnt;
            }
            max = Math.max(cnt, max);
            return;
        }

        //알파벳 선택하기
        for(int i  = idx; i < 26; ++i) {
            if(!visited[i]) {
                visited[i] = true;
                Backtracking(i + 1, cntAlphabet + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //전처리
        StringTokenizer str = new StringTokenizer(br.readLine());
        n = Integer.parseInt(str.nextToken());  //총 단어의 개수
        k = Integer.parseInt(str.nextToken());  //가르쳐야 할 단어의 개수

        words = new String[n];

        for(int i = 0; i < n; ++i) {
            words[i] = br.readLine().replace("anta", "").replace("tica", "");
        }

        //기본 알파벳 넣기
        visited['a' - 'a'] = true;
        visited['n' - 'a'] = true;
        visited['t' - 'a'] = true;
        visited['i' - 'a'] = true;
        visited['c' - 'a'] = true;

        if(k < 5) {
            bw.write(0 + "");
        } else if(k == 26) {
            bw.write(n + "");
        }else {
            Backtracking(0, 0);
            bw.write(max + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
