public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(34);
        ll.insert(50);
        ll.insert(67);
        ll.insertAt(2, 100);
        ll.insert(45);
        ll.insertAtStart(300);
        ll.insertAt(0, 10);
        ll.show();
    }
}