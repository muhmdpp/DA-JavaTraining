package tamilnadu.chennai;
public class Office{
    final int salary=45000;
    public Office(){
        System.out.println("welcome to Office");
    }
   
    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        // off.salary=50000;
    }
    public void work(){
        System.out.println("Working in Office");
    }
    void recruit(){
        System.out.println("Recruiting");
    }
    protected void wfh(){

    }
    private void do_business_plan(){
        System.out.println("planning");
    }
}