package Day8;

public class School {
    static String name="ABC School";
    int fees;
    public static void main(String[] args) {
        School admission = new School();
        admission.fees=1000;
        System.out.println(name);
        System.out.println(admission.fees);
        admission.teaching();
    }

    void teaching(){
        System.out.println("teacher is teaching");
    }
}
