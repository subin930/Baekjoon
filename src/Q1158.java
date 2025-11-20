import java.util.*;
import java.io.*;

 class Q1158 {
     public static void main(String[] args) throws IOException{
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         StringTokenizer str = new StringTokenizer(bf.readLine());

         int n = Integer.parseInt(str.nextToken());
         int k = Integer.parseInt(str.nextToken());

         Deque<Integer> queue = new ArrayDeque<>();
         int[] arr = new int[n];
         int cnt = 0;

         //요소 넣기
         for(int i = 1; i <= n; ++i) {
             queue.add(i);
         }

         //요세푸스 순열 구하기
         int check = 1;
         while(!queue.isEmpty()) {
             if(check == k) {
                 arr[cnt++] = queue.poll();
                 check = 1;
             } else {
                 queue.add(queue.poll());
                 ++check;
             }
         }

         bw.append('<');
         for(int i = 0; i < arr.length - 1; ++i) {
             bw.append(String.valueOf(arr[i]));
             bw.append(',');
             bw.append(' ');
         }
         bw.append(String.valueOf(arr[arr.length - 1]));
         bw.append('>');

         bw.flush();
         bw.close();
         bf.close();
     }
}
