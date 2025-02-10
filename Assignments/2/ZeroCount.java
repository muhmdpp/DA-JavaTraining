// package Assignments.2;

public class ZeroCount {
    public static void main(String[] args) {
        int n = 120000;
        int rem = 0, count = 0;
        while (n != 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;

        }
        System.out.println(count);
    }
}
