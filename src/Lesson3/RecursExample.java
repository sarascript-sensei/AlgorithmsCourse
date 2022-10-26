package Lesson3;

public class RecursExample {
    public static void main(String[] args) {
        System.out.println("Итерационный метод");
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(7));
        System.out.println(fact(8));
        System.out.println("Рекурсивный метод");
        System.out.println(factRecursion(2));
        System.out.println(factRecursion(3));
        System.out.println(factRecursion(4));
    }
/*    public static void recursionFunc(){
        System.out.println("Hello world");
        recursionFunc();
    }*/

    public static int fact(int n) {
        if(n<0){
            System.out.println("Неверный формат");
            return 0;
        }
        int result = 1;
        if (n==0){
            return result;
        }
        for(int i = 1; i<=n; i++){
            result = result * i;
        }
        return result;
    }

    public static int factRecursion(int x) { //5 * 4 * 3 * 2 * 1
        if(x == 1){
            return 1;
        }
        return x * factRecursion(x-1);
    }
}
