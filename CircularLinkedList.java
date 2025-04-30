import java.util.Scanner;

// Node class remains the same
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Modified LinkedList class for circular linked list
class CircularLinkedList {
    Node head;
    Node tail; // Added tail pointer for circular list

    // Method to add a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points to itself to form circle
        } else {
            tail.next = newNode;
            newNode.next = head; // New node points back to head
            tail = newNode; // Update tail
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        
        // Using do-while to ensure we print at least once
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        
        System.out.println("(back to head)");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.append(data);
        }

        list.display();
        scanner.close();
    }
}
