package Day8;

public class SuperMarket {

    //globalVariable/nonStatic var/fields...
    static String name="Mall Hypermarket";
    //declared as static , bcz, it is not constant. it can be changed.
    //but it will reflect in the sub classes or the Object created upon the classes 
    String pname;
    int price;
    int discount;
    SuperMarket(){
        System.out.println("Welcome");
    }
    //constructor Overloading
    SuperMarket(String p,int p1,int d){
        this.pname=p;
        this.price=p1;
        this.discount=d;

        

    }
    //even if the constuctor is deleted, an invisible constructor is created.
    
    
    public static void main(String[] args) {
        SuperMarket product1=new SuperMarket();
        // product1.pname="rice";
        // product1.price=20;
        // product1.discount=5;


        SuperMarket product2=new SuperMarket();
        // product2.pname="biscuits";
        // product2.price=50;
        // product2.discount=10;
        SuperMarket product3=new SuperMarket("rice",50,10);
        System.out.println(name);
        System.out.println(product1.pname);

        System.out.println(product3.discount);
        product3.display();
    }

    void display(){
        System.out.println("Product name is: "+this.pname);
    }
}
