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
        System.out.println("How many elements are their?");
        int N = sc.nextInt();
        System.out.println("Type elements : ");
        int val = sc.nextInt();
        Node head = new Node(val);

        for(int i=1; i<N; i++) {
            val = sc.nextInt();
            insert(head, val);
        }
        
        System.out.print("This is middle element : ");
        System.out.println(findMiddle(head));
    }

    public static void insert(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public static int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
