public class NoDupArray {
    private long[] a;
    private int nEliments;

    public NoDupArray(int max) {
        this.a = new long[max];
        this.nEliments = 0;
    }

    public boolean find(long SearchKey) {
        for (int i = 0; i < nEliments; i++) {
            if (a[i] == SearchKey) {
                return true;
            }
        }
        return false;
    }

    public void insert(long value) {
        if (a.length == nEliments) {
            System.out.println("The array is full. Insertion terminated");
        } else {
            if (find(value)) {
                System.out.println("Value is already in the array. Insertion terminated");
                return;
            }
            a[nEliments] = value;
            nEliments++;
            System.out.println("Insertion success...");
        }
    }

    public boolean delete(long value) {
        if (nEliments == 0) {
            System.out.println("Array is empty. deletion terminated.");
            return false;
        }
        int index = -1;
        for (int i = 0; i < nEliments; i++) {
            if (this.a[i] == value) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("The value do not in the array");
            return false;
        }
        for (int i = index; i < nEliments-1; i++) {
            a[i] = a[i+1];
        }
        this.nEliments--;
        System.out.println("The value deleted successfully...");
        return true;
    }

    public void display() {
        for (int i = 0; i < nEliments; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
