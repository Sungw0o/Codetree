import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size = 0;

        void push_front(int a) {
            Node newNode = new Node(a);
            if (size == 0) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        void push_back(int a) {
            Node newNode = new Node(a);
            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        int pop_front() {
            if (size == 0) return -1;
            int data = head.data;
            head = head.next;
            size--;
            if (size == 0) tail = null;
            return data;
        }

        int pop_back() {
            if (size == 0) return -1;
            int data = tail.data;
            if (size == 1) {
                head = tail = null;
            } else {
                Node curr = head;
                while (curr.next != tail) {
                    curr = curr.next;
                }
                curr.next = null;
                tail = curr;
            }
            size--;
            return data;
        }

        int size() {
            return size;
        }

        int empty() {
            return size == 0 ? 1 : 0;
        }

        int front() {
            return size == 0 ? -1 : head.data;
        }

        int back() {
            return size == 0 ? -1 : tail.data;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        LinkedList list = new LinkedList();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    list.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    list.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(list.pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(list.pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    sb.append(list.empty()).append("\n");
                    break;
                case "front":
                    sb.append(list.front()).append("\n");
                    break;
                case "back":
                    sb.append(list.back()).append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}