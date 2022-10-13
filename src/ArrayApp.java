public class ArrayApp {
    //CRUD - Create,Read,Update,Delete
    public static void main(String[] args) {
        int[] arr;
        int i;
        arr = new int[10];
        arr[0] = 88;
        arr[1] = 65;
        arr[2] = 12;
        arr[3] = 34;
        arr[4] = 51;
        arr[5] = 32;
        arr[6] = 1;
        arr[7] = 23;
        arr[8] = 23;


        //Вывод элементов
        for(i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println("");
        }
        //Поиск элемента
        int searchKey = 100;
        for(i=0; i<arr.length;i++){
            if(arr[i]==searchKey){
                break;
            }
        }
        if(i==arr.length){
            System.out.println("Can't find " + searchKey);
        }else{
            System.out.println( searchKey + " Found at: " + i);
        }
       /* //Вариант 2
        int searchKey = 51;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey) {
                System.out.println("Found at: " + arr[i]);
                break;
            }
        }
        System.out.println("Can't find " + searchKey);*/
    }
}
