import java.util.*;
import java.io.*;

public class Q15651 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public void DFS(int depth) {
        if(depth == M) {
            for(int i = 0; i < M; ++i) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; ++i) {
            arr[depth] = i + 1;
            DFS(depth + 1);
        }
    }
    public static void main(String[] args) throws IOException{
        Q15651 T = new Q15651();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        arr = new int[M];

        T.DFS(0);

        System.out.println(sb);
    }
}
