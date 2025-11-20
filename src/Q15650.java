import java.util.*;
import java.io.*;

public class Q15650 {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static int N;
    public static int M;

    public void DFS(int currentIdx, int depth) {
        if(depth == M) {
            for(int i = 0; i < M; ++i) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = currentIdx; i < N; ++i) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                DFS(i + 1, depth + 1);
                visit[i] = false;
            }
        }

        return;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        Q15650 T = new Q15650();

        T.DFS(0, 0);

        System.out.println(sb);
    }
}
