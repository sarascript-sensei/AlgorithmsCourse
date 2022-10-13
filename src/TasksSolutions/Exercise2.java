package TasksSolutions;

public class Exercise2 {
    public static void main(String[] args) {
        double arr[] = {1, 2, 3, 4};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        double average = (double) sum/arr.length;
        System.out.println("Среднее арифметическое : " + average);
    }
}
