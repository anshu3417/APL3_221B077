public class Test implements Testable {

    @Override
    public void display() {
        System.out.println("This is the display method from Test class.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
