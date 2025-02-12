public class Student extends Teacher{
    public static void main(String[] args) {
        Student st=new Student();
        st.teaching();
        st.questionPaper();
        
    }


    void questionPaper() {
        System.out.println("good paper");
    }

    
}
