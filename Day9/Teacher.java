public abstract class Teacher {
    Teacher(){
        System.out.println("teacher's constructor");
    }
    public static void main(String[] args) {
        
    }
    void teaching(){
        System.out.println("teacher is teaching");
    }

    abstract void questionPaper(); 
    //abstract method --> but we have to put keyword "abstract",
    //if we are using interface, no need to mention "abstract".
    //
}
