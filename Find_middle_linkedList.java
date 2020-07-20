import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("How many elements are their?");
        int N = sc.nextInt();
        if(N != 0) {
            int posi = N/2;

            int val = sc.nextInt();
            Node head = new Node(val);
            Node tail = head;

            int result = 0;
            
            for(int i=1; i<N; i++) {
                val = sc.nextInt();
                posi-- ;
                if(posi == 0) {
                    result = val;
                }
                tail = insert(head, tail, val);
            }

            System.out.print("This is middle element : ");
            System.out.println(result);
        } else {
            System.out.println("No List!");
        }
    }

    public static Node insert(Node head, Node tail,int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        return newNode;
    }

    /* public static int findMiddle(Node head, int N) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(N%2 == 0) {
            return slow.next.data;
        }

        return slow.data;
    } */

}
