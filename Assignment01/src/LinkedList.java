public class LinkedList {
    private Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) { // inserting the first value
            this.head = node;
        } else {            // if the linked list is not empty
            Node n = this.head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = this.head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void delete(int index) {
        Node deleting = this.head;
        Node previous = this.head;

        for (int i = 0; i < index-1; i++) {
            deleting = deleting.next;
        }
        deletingEkatakalinEka.next = deleting.next;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node();

        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;

            Node value = head;
            for (int i = 0; i < index - 1; i++) {
                value = value.next;
            }
            newNode.next = value.next;
            value.next = newNode;
        }
    }

}
