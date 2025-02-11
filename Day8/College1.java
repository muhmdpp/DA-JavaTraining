package tamilnadu.chennai;
import tamilnadu.chennai.College;
public class College1 {
    static String clgName="DACE";
    public static void main(String[] args) {
        College1 clg1=new College1();
        clg1.display();

        College clg=new College();
        clg.studying();
        clg.recruit();
    }
    void display(){
        System.out.println("WElcome to clg");
    }
}
