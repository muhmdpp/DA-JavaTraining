package Day7;

public class StringBuilder5 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Hello");
        StringBuilder sb2= new StringBuilder("Hello");
        String s1="Hello";
        System.out.println(s1);
        //hashCode() method is used to 
        System.out.println(s1.hashCode());
        String s2=s1;
        System.out.println(s2+"is located at "+s2.hashCode());
        s1="Heyy";
        System.out.println(s1+s1.hashCode());
        
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        //for checking the content of StringBuilder
        System.out.println((sb1.toString()).equals(sb2.toString()));


    }
}
