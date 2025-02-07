package Day4;

public class PerfectNumberAmith {
    import java.util.*;
public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		for(int i =1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;	
			}
		}
			
		System.out.println((sum==num));
		
		s.close();


}
}
