public class Main {
    public static void main(String[] args) {

        NoDupArray x = new NoDupArray(5);

        x.insert(45);
        x.insert(15);
        x.insert(100);
        x.insert(4);
        x.insert(7);

        x.delete(4);
        x.display();
    }
}