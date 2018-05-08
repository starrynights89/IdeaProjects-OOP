package GenericsDemo;

public class FancyBoxTester {

    public static void main(String[] args) {

        FancyBox<String> myBox = new FancyBox<>();

        myBox.put("This string is in my FancyBox!");

        System.out.println(myBox.get());
    }
}
