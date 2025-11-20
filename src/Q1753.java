import java.util.*;
import java.io.*;

//priorityQueue 배우고 다시 풀기
class Edge {
    public int end;
    public int weight;

    public Edge (int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
}
public class Q1753 {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        StringTokenizer str1 = new StringTokenizer(bf.readLine());

        int num_v = Integer.parseInt(str1.nextToken());
        int num_e = Integer.parseInt(str1.nextToken());

        int start_vertex = Integer.parseInt(bf.readLine());

        ArrayList<Edge>[] all = new ArrayList[num_v+1];
        Boolean[] check = new Boolean[num_v+1];
        int[] path = new int[num_v+1];


        for(int i = 0; i <= num_v; ++i) {
            if(i == start_vertex) path[i] = 0;
            path[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < num_e; ++i) {
            StringTokenizer str = new StringTokenizer(bf.readLine());

            int u = Integer.parseInt(str.nextToken());
            int v = Integer.parseInt(str.nextToken());
            int w = Integer.parseInt(str.nextToken());

            all[u].add(new Edge(v, w));
        }

         */
        String x = "123450";
        x = x.replaceFirst("1", "-");
        x = x.replaceFirst("0", "-");
        x = x.replaceFirst("0", "-");
        System.out.println(x);
    }

}
