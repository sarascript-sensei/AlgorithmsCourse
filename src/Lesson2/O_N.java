package Lesson2;

public class O_N {
    public static void main(String[] args) {
        for(int n = 32; n<=262144; n*=2){
            int [] array = createArray(n);

            long sum = 0;

            long time = System.nanoTime();
            for(int i=0; i<n; i++){
                sum += array[i];
            }
            time = System.nanoTime() - time;
            System.out.printf("n = %d -> time = %d ns%n", n, time);
        }
    }

    //262 144 - 2098800
    public static int[] createArray(int n){
        int [] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = i;
        }
        return array;
    }
}
