import java.util.*;
import java.io.*;

class deque {
    Deque<Integer> deque;

    public deque() {
        this.deque = new ArrayDeque<>();
    }

    public void addFirst(int data) {
        deque.addFirst(data);
    }

    public void addLast(int data) {
        deque.addLast(data);
    }

    public int removeFirst() {
        if (deque.isEmpty()) return -1;
        return deque.removeFirst();
    }

    public int removeLast() {
        if (deque.isEmpty()) return -1;
        return deque.removeLast();
    }

    public int size() {
        return deque.size();
    }

    public int isEmpty() {
        return (deque.isEmpty()) ? 1 : 0;
    }

    public int getFirst() {
        if (deque.isEmpty()) return -1;
        return deque.getFirst();
    }

    public int getLast() {
        if (deque.isEmpty()) return -1;
        return deque.getLast();
    }
}
public class Q28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        deque d = new deque();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; ++i) {
            StringTokenizer str = new StringTokenizer(bf.readLine());
            int command = Integer.parseInt(str.nextToken());

            switch(command) {
                case 1:
                    int num = Integer.parseInt(str.nextToken());
                    d.addFirst(num);
                    break;
                case 2:
                    int num2 = Integer.parseInt(str.nextToken());
                    d.addLast(num2);
                    break;
                case 3:
                    sb.append(d.removeFirst()).append("\n");
                    break;
                case 4:
                    sb.append(d.removeLast()).append("\n");
                    break;
                case 5:
                    sb.append(d.size()).append("\n");
                    break;
                case 6:
                    sb.append(d.isEmpty()).append("\n");
                    break;
                case 7:
                    sb.append(d.getFirst()).append("\n");
                    break;
                case 8:
                    sb.append(d.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }
}
