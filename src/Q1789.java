import java.util.*;
import java.io.*;

public class Q1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int check = 1;
        int sum = 0;

        while(sum <= n) {
            sum += check;
            ++check;
        }
        bw.write(check - 2 +"");
        bw.flush();
        bw.close();
        br.close();
    }
}
