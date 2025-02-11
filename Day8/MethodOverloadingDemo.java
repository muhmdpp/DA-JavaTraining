package Day8;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 5;
        add(a, b, c);
        add(a, b);
    }
    //Method Overloading
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
