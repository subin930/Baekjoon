import java.util.*;
import java.io.*;

public class Q24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer str1 = new StringTokenizer(bf.readLine());
        StringTokenizer str2 = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        StringTokenizer str3 = new StringTokenizer(bf.readLine());

        Deque<Integer> d = new ArrayDeque<>();

        int[] type = new int[n];

        for(int i = 0; i < n; ++i) {
            int t = Integer.parseInt(str1.nextToken());
            int num = Integer.parseInt(str2.nextToken());
            type[i] = t;
            if(t == 0) {
                d.add(num);
            }
        }

        for(int i = 0; i < m; ++i) {
            int x = Integer.parseInt(str3.nextToken());
            d.addFirst(x);
            sb.append(d.removeLast()).append(" ");
        }
        System.out.println(sb);
    }
}
