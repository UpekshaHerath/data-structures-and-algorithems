public class OrdArray {
    private long []a; // ref to the orderArray
    private int nElements; // number of data items

    public OrdArray(int max) {
        this.a = new long[max];
        this.nElements = 0;
    }

    public int size() { // return max size of the body
        return this.a.length;
    }

    public int find(long serachKey) {
        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] == serachKey) {
                return i;
            }
        }
        return -1;
    }

    public void insert(long value) { // put elements into array
        if (this.nElements == this.size()) {
            System.out.println("Array is full. Insertion terminated...");
            return;
        }

        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] > value) {
                for (int j = this.nElements; j > i ; j--) {
                    this.a[j] = this.a[j-1];
                }
                this.a[i] = value;
                this.nElements++;
                return;
            }
        }

        a[this.nElements] = value;
        this.nElements++;
    }

    public boolean delete(long value) {
        if (this.nElements == 0) {
            System.out.println("Array is empty. Deletion terminate.");
            return false;
        }

        boolean status = false;
        for (int i = 0; i < this.nElements; i++) {
            if (a[i] == value) {
                for (int j = i; j < this.nElements-1; j++) {
                    a[j] = a[j+1];
                }
                this.nElements--;
                i--;
                status = true;
            }
        }
        return status;
    }

    void display() { // display array elements
        if (this.nElements == 0) {
            System.out.println("Array is empty...");
            return;
        }
        for (int i = 0; i < this.nElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}
