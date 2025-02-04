import java.util.Scanner;

public class NoDaysInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=2;
        int days=0;
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:days=31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:days=30;
            break;
            case 2:
            System.out.println("Enter Year:");
            int year =sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0){
                days=29;
            }else{
                days=28;
            }
            sc.close();
            default:
                break;
        }

        System.out.println("days are:"+days);
    }
}
