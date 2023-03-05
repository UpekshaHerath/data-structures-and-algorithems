public class Main {
    public static void main(String[] args) throws Exception {
        QueueArray qa = new QueueArray(5);
        qa.enQueue(5);
        qa.enQueue(10);
        qa.enQueue(40);
        qa.displayQueue();
        qa.deQueue();
        qa.displayQueue();
        qa.enQueue(100);
        qa.enQueue(3);
        qa.enQueue(1000);
        qa.enQueue(6);
        qa.displayQueue();
        System.out.println(qa.peek());
        qa.deQueue();
        qa.displayQueue();
        System.out.println(qa.peek());

        System.out.println(qa.isEmpty());
        System.out.println(qa.isFull());
        System.out.println(qa.size());
        qa.enQueue(5000);
        System.out.println(qa.size());

        // new values for testing
        QueueArray q = new QueueArray(7);
        q.enQueue(50);
        q.enQueue(50);
        q.enQueue(5);
        q.enQueue(45);
        q.enQueue(6);
        q.enQueue(40);
        q.enQueue(11);
        q.displayQueue();
    }
}