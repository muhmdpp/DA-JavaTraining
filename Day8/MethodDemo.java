package Day8;

public class MethodDemo {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        MethodDemo d=new MethodDemo();
        int result=d.add(a,b);
        System.out.println(result);
        mul(a, b);
    }
    int add(int a,int b){
        return a+b;
    }
    static void mul(int a,int b){
        System.out.println(a*b);
    }
    static void sub(int a,int b){
        System.out.println(a-b);
    }
    
}
