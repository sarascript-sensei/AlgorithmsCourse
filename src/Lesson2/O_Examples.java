package Lesson2;

public class O_Examples {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Hey - your input: "+n);
        System.out.println("Hey - your input again: "+n);
        System.out.println("Hey - your input again 2: "+n);
        //O(1000)->O(1)


        for(int i = 1; i<n; i=i*2){
            System.out.println(i); //O(log(n))
        }

        //log(1000) = 10

        //O(n) - линейная временная сложность

        for (int i = 0; i<n;i++){
            System.out.print(i + " ");
        }

        //O(n log n) -> 8 * log(8) - > 8 * 3 = 24

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<n; j=j*2){
                System.out.println(i + " and " + j); //O(n log n)
            }
        }

        //O(n^2) -> 64
        //O(n^3) -> ...

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.println(i + " and " + j); //O(n^p)
            }
        }

        //O(k^n) -> 2^8 = 256

        for (int i=1; i<=Math.pow(2,n); i++){
            System.out.print(i + " ");
            System.out.println();
        }
        int [] arr = {32,122,3,4,51,2,5,45,33,12};
        System.out.println(searchElement(arr, 12));
    }


    // Линейный поиск (найти элемент в массиве). O(n)

    public static int searchElement(int [] arr, int elementToFind){ // 1,2,4,3,6,5
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == elementToFind){
                return i;
            }
        }
        return -1;
    }


}
