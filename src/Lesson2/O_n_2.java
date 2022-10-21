package Lesson2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class O_n_2 {
    public static void main(String[] args) {
       /* for(int n = 32; n <= 262144; n*=2){
            int [] array = createRandomArrayOfSize(n);
            long time = System.nanoTime();
            insertionSort(array);
            time = System.nanoTime() - time;
            System.out.printf("n = %d -> time = %d ns%n", n, time);
        }
    }*/
        int[] arr = {2, 3, 1, 23, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // 262 144 - 16077146200

 /*   public static int[] createRandomArrayOfSize(int n){
        ThreadLocalRandom random = ThreadLocalRandom.current();

        int[] array = new int[n];
        for (int i = 0; i<n; i++){
            array[i] = random.nextInt();
        }
        return array;
    }*/

    public static void insertionSort(int[] elements){
        for(int i = 1; i<elements.length; i++){
            int elementToSort = elements[i];
            int j = i;
            while(j>0 && elementToSort < elements[j-1]){
                elements[j] = elements[j-1];
                j--;
            }
            elements[j] = elementToSort;
        }
    }
}
