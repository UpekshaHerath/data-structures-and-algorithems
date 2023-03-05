public class QueueArray {
    private int maxSize; // initialize when que is creating the maximum size of the queue
    private int[] queArray;
    private int front; // stores the front value
    private int rear; // stores the rear value
    private int nItems; // track the number of items in the array

    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        this.nItems = 0;
    }

    // insert an value to the queue
    public void enQueue(int newValue) {
        if (this.isFull()) {
            System.out.println("Queue is full. Can't insert another value");
            return;
        }
        queArray[this.nItems] = newValue;
        this.nItems++;
        this.rear = newValue;
        if (this.nItems == 1) {
            this.front = newValue;
        }
        System.out.println("Insertion is success");

    }

    // delete an item from the queue
    public int deQueue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Que is empty can not remove values");
        } else {
            int temp = this.queArray[0];
            this.front = this.queArray[1];
            for (int i = 1; i < this.nItems; i++) {
                this.queArray[i - 1] = this.queArray[i];
            }
            this.nItems--;
            return temp;
        }
    }

    // return the front item of the queue without deleting.
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty. No peek value");
        } else {
            return this.front;
        }
    }

    // return the end value of the queue without deleting
    public int end() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty. No rear value");
        }
        return this.rear;
    }

    public boolean isEmpty() {
        return (this.queArray.length == 0);
    }

    public boolean isFull() {
        return (this.nItems == this.queArray.length);
    }

    public int size() {
        return this.nItems;
    }

    public void displayQueue() {
        for (int i = 0; i < this.nItems; i++) {
            System.out.print(this.queArray[i] + " ");
        }
        System.out.println();
    }

}
