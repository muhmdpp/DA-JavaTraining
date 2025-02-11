// package Inheritance;
package tamilnadu.chennai;
// import tamilnadu.chennai.Office;

public class BranchOffice extends Office{
    public BranchOffice(){
        System.out.println("Welcome to Branch Office");
    }
    public static void main(String[] args) {
        BranchOffice bff=new BranchOffice();
        bff.work();
        bff.wfh();
        bff.recruit();
        System.out.println(bff.salary);
    }

    public void celebrate_local_function(){
        System.out.println("Celebrating");
    }
}
