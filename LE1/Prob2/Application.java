// Application class to test polymorphism
class Application {
    public static void main(String args[]) {
        // Polymorphism: Mother reference pointing to Child object
        Mother m1 = new Child();
        m1.show(); // Calls Child's show() method because m1 points to a Child object

        // Creating an instance of Mother and calling show()
        Mother m2 = new Mother();
        m2.show(); // Calls Mother's show() method
    }
}
