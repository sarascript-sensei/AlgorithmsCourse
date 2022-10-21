package Lesson2;

public class TaskAnswers {
    public static void main(String[] args) {
        int count = 0;
        for(int i=0; i<1000; i++){
            for(int j = i+1; j<1000; j++){
                count++;
              /*  if(my_array[i]==my_array[j]){
                    System.out.println("Дупликат: " + my_array[j]);
                    break;
                }*/
            }
        }
        System.out.println(count);
    }

}

