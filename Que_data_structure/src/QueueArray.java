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

    public void enQueue(int newValue) { // insert an value to the queue
        if (this.isFull()) {
            System.out.println("Queue is full. Can't insert another value");
            return;
        }
        queArray[this.nItems] = newValue;
        this.nItems++;
        this.rear = newValue;
        System.out.println("Insertion is success");

    }

    public int deQueue() throws Exception { // delete an item from the queue
        if (this.isEmpty()) {
            throw new Exception("Que is empty can not remove values");
        } else {
            int temp = this.queArray[0];
            this.front = this.queArray[1];
            for (int i = 1; i < this.nItems; i++) {
                this.queArray[i-1] = this.queArray[i];
            }
            this.nItems--; // set
            return temp;
        }
    }

    public int peek() { // return the front item of the queue without deleting.
        return this.front;
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
