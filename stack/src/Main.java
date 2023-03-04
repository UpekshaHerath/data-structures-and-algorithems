public class Main {
    public static void main(String[] args) throws Exception {
        StackArray sa = new StackArray(3);
        sa.conversionDecimalToBinary(200);
    }
}
class StackArray {
    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack

    public StackArray(int s) {
        this.stackData = new int[s];
        this.maxSize = s;
        this.top = -1; // because there is not a top value
    }

    public boolean isEmpty() {
        return (this.top == -1); // because there is not a top value means this array is empty
    }

    public boolean isFull() {
        return (this.top == (this.maxSize - 1));
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Can't add more values");
        } else {
            this.stackData[++this.top] = item;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty can not pop a value");
        } else {
            int temp = this.stackData[top];
            this.top--;
            // no need to delete the value. That particular value is already in the stack. But can't access for the user.
            return temp;
            // or can use this one line istead of these 3 values => return this.stackdata[top--]
        }

    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is empty. There is not a peek value");
        } else {
            return this.stackData[top];
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(this.stackData[i] + " ");
        }
        System.out.println();
    }

    public void conversionDecimalToBinary(int n) {
        int temp = n;
        int count = 0;

        while (temp != 0) {
            int x = temp % 2;
            temp /= 2;
            count++;
        }

        temp = n;
        StackArray newStack = new StackArray(count);
        while (temp != 0) {
            int x = temp % 2;
            newStack.push(x);
            temp /= 2;
        }
        while (!newStack.isEmpty()) {
            int value;
            try {
                value = newStack.pop();
                System.out.print(value);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.print(" ");
    }
}