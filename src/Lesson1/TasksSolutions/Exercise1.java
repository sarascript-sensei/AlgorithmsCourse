package Lesson1.TasksSolutions;

public class Exercise1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = 0;

        for(int i : arr){
            sum+=i; // sum=sum+i;
        }
        //KISS - Keep it simple stupid
        System.out.println("The sum is " + sum);
    }
}
