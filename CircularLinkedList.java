import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class
public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Build the circular linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head; // Circular link for the first node
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head; // Make it circular
            }
        }

        // Display the circular linked list
        System.out.print("Circular Linked List: ");
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
    }
}
