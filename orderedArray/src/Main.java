public class Main {
    public static void main(String[] args) {
        OrdArray ard = new OrdArray(5);
        ard.insert(5);
        ard.insert(1);
        ard.insert(3);
        ard.insert(20);
        ard.display();
        ard.delete(1);
        ard.display();
        System.out.println(ard.find(5));
        System.out.println("20 can be found in location number : " + ard.find(20));
    }
}