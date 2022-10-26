package Lesson3;

import java.util.Scanner;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        factorial(n);
    }

    public static int factorial(int n){
        System.out.println("factorial(" + n + ") : ");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f : frames){
            System.out.println(f);
        }
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


}
