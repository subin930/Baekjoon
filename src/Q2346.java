import java.util.*;
import java.io.*;

class Node {
    int data;
    int order;

    Node(int data, int order) {
        this.data = data;
        this.order = order;
    }
}
public class Q2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer str = new StringTokenizer(bf.readLine());
        Deque<Node> d = new ArrayDeque<>();

        for(int i = 0; i < n; ++i) {
            int data = Integer.parseInt(str.nextToken());
            d.add(new Node(data, i + 1));
        }

        int step = d.remove().data;
        sb.append("1 ");
        while(!d.isEmpty()) {
            if(step < 0) {
                for(int i = 0; i < Math.abs(step) - 1; ++i) {
                    d.addFirst(d.pollLast());
                }
                Node currentNode = d.removeLast();
                sb.append(currentNode.order).append(" ");
                step = currentNode.data;

            } else {
                for(int i = 0; i < step - 1; ++i) {
                    d.addLast(d.pollFirst());
                }
                Node currentNode = d.removeFirst();
                sb.append(currentNode.order).append(" ");
                step = currentNode.data;
            }
        }

        System.out.println(sb);
    }
}
