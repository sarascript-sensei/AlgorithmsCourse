package Lesson3;

public class Tasks {

    /*

    Задания по рекурсии:

    1. Дано неотрицательное значени int n, небходимо вернуть количество семерок в этом значении, например в числе 717
    есть 2 семерки, значит функция вернет 2. Обратите внимание, что умножение (%) на 10 дает крайнюю правую цифру
     (126 % 10 равно 6),
     в то время как деление (/) на 10 удаляет крайнюю правую цифру (126/10 равно 12).

     Пример ответа:
     count7(717) → 2
     count7(7) → 1
     count7(123) → 0



     2.У нас есть несколько кроликов, и у каждого кролика два больших висячих уха.
     Мы хотим вычислить общее количество ушей у всех кроликов рекурсивно (без циклов или умножения).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4

     3. Сумма цифр числа
    Дано натуральное число N. Вычислите сумму его цифр.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).

    4.    От A до B
    Даны два целых числа A и В (каждое в отдельной строке).
    Выведите все числа от A до B включительно, в порядке возрастания,
    если A < B, или в порядке убывания в противном случае.
     */

    public static int count7(int n){
        if(n==0){
            return 0;
        }

        if(n%10 == 7){
            return 1 + count7(n/10);
        }
        return count7(n/10);
    }

    public static int bunnyEarsCount(int n){//3
        if(n==0){
            return 0;
        }
        return 2 + bunnyEarsCount(n-1);
    }

    public static int sum(int a){
        if(a<10){
            return a;
        }
        return a%10 + sum(a/10);
    }

    public static String riseNumber (int a, int b){ // a=5, b = 10
        if(a==b){
            return Integer.toString(a);
        }

        if(a>b) {
            return a + " " + riseNumber(a - 1, b);
        }
        else {
            return a + " " + riseNumber(a+1,b);
        }

    }
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(717421475));
        System.out.println(bunnyEarsCount(3));
        System.out.println(riseNumber(5,10));
        System.out.println(sum(1424));
    }
}
