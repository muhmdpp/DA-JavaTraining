package Day8;

public class Test {
    static String a="Hello";
    public static void main(String[] args) {
        Test t=new Test();
        Test t1=new Test();
        t.display();
        t1.display1();
    }
    void display(){
        a="boy";
    }
    void display1(){
        System.out.println(a+"new boy");    }
}
