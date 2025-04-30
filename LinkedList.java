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
public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input and build the linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;  // First node becomes head
                tail = newNode;  // Tail also points to the same
            } else {
                tail.next = newNode;  // Link last node to new node
                tail = newNode;       // Move tail to new node
            }
        }

        // Display the linked list
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
