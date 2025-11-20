import java.util.*;
import java.io.*;

public class Q3273 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer str = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;
        int cnt = 0;

        while(lt < rt) {
            int num = arr[lt] + arr[rt];
            if(num > x) {
                --rt;
            } else if(num < x) {
                ++lt;
            } else {
                ++lt;
                ++cnt;
            }
        }

        System.out.println(cnt);
    }
}
