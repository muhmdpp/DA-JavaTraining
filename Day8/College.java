// package tamilnadu.chennai;
package Day8;
public class College {
    static String clgname="DACE";
    int fees = 20000;
    public static void main(String[] args) {
        College clg=new College();
        clg.studying();
        clg.semesterPaper();
        
        display();
    }

    static void display(){
        System.out.println("Welcome to College");
    }
    public void studying(){
        System.out.println("Students are studying");
    }
    void recruit(){
        System.out.println("Company is recruiting");
    }
    protected void write(){
        System.out.println("Exams are going on");
    }
    private void semesterPaper(){
        System.out.println("Top Secret");
    }
}

