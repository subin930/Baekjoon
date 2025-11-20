import java.util.*;
import java.io.*;

public class Q2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer str = new StringTokenizer(bf.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;


        while(lt < rt) {
            int num = arr[lt] + arr[rt];
            if(Math.abs(min) > Math.abs(num)) {
                min = num;
                x = arr[lt];
                y = arr[rt];
            }

            if(num < 0) ++lt;
            else if(num > 0) --rt;
            else break;
        }

        System.out.printf("%d %d", x, y);
    }
}
