public class Main {
    public static void main(String[] args) {
        OrdArray ard = new OrdArray(5);
        ard.insert(5);
        ard.insert(1);
        ard.insert(3);
        System.out.println(ard.find(3));
        ard.display();
    }
}