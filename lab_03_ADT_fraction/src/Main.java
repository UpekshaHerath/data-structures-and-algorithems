public class Main {
    public static void main(String[] args) {
        ADTFraction value = new ADTFraction();
        value.display();
        ADTFraction value2 = new ADTFraction(5, 9);
        value2.display();

        ADTFraction value3 = new ADTFraction(2, 3);
        ADTFraction value4 = new ADTFraction(4, 5);
        ADTFraction answer1 = value3.plus(value4);
        answer1.display(); // 22/15

        ADTFraction multiplication1 = value3.times(value4);
        multiplication1.display(); // 8/15



    }
}