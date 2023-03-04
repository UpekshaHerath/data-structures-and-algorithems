public class Main {
    public static void main(String[] args) {
        LinkList myLinkedList = new LinkList();
        myLinkedList.insertFirst(13);
        myLinkedList.insertFirst(9);
        myLinkedList.insertFirst(34);
        myLinkedList.insertFirst(31);
        myLinkedList.displayList();
        myLinkedList.deleteFirst();
        myLinkedList.displayList();

        Node findNode = myLinkedList.find(3);
        if (findNode == null) {
            System.out.println("The display node is null");
        } else {
            findNode.displayNode();
        }
        myLinkedList.delete(3);
        myLinkedList.displayList();
    }
}
class Node {
    int data;
    Node next;

    Node(int item) {
        this.data = item;
        this.next = null;
    }
    void displayNode() {

        System.out.print(this.data + " ");
    }
}
class LinkList {
    private Node head;
    public void LinkList() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    // if assume that the linked list already have been created then we need to insert a new value at the beginning;
    // then we have to first create that particular node, then assign the address of the current head to this nodes next value
    // then have to point the nex node to this head value
    // this code is working for an empty linked list and also a created linked list to insert a new value at the beginning
    public void insertFirst(int i) {
        Node newNode = new Node(i);
        newNode.next = this.head;
        this.head = newNode;
    }

    // just have to change the reference of the head to second node.
    // to return the deleted node we can keep that node in a temporary variable. Because after deleting we can't find the deleted node
    // the second node reference is in the first node's next value (that means head's next value)
    // but if the linked list is empty the head value = null. Then when we access the head.next value an exception will be occurred.have to handle that
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return null;
        } else {
            Node deletedNode = this.head;
            this.head = this.head.next;
            return deletedNode;
        }
    }

    // To display linked list items one by one
    // this work when the empty list is null too
    public void displayList() {
        if (isEmpty()) {
            System.out.println("The linked list is empty. Nothing to print...");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.displayNode();
            temp = temp.next;
        }
        System.out.println();
    }


    public Node find(int key) {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            if (key == i) {
                return temp;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Key value is out of linked list");
        return null;
    }


    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Nothing to delete");
            return;
        }
        Node current, previous;
        current = head;
        previous = head;
        int count = 1;
        while (current != null) {
            if (count == key) {
                if (key == 1) {
                    head = head.next;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Item deleted");
                return;
            }
            previous = current;
            current = current.next;
            count++;
        }
        System.out.println("Item not available for the deletion");
    }

    public void deleteLast() {

    }

    public void insertLast() {

    }

    public void insertMiddle(int after, int data) {

    }
}