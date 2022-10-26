package Lesson3.CatStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackCatDemo {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 4);
        Cat murzik = new Cat("Мурзик", 6);
        Cat vaska = new Cat("Васька", 9);
        //Stack - > Last in, first Out

        Stack<Cat> catStack = new Stack<>();
        catStack.push(barsik);
        catStack.push(murzik);
        catStack.push(vaska);

        System.out.println("Текущий стек: " + catStack);
        System.out.println("Удаляем из стека " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString());
        System.out.println("Удаляем из стека " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString());
        System.out.println("Удаляем из стека " + catStack.pop());
        System.out.println("Никого? " + catStack.empty());

        try{
            System.out.println("Кто последний? " + catStack.peek().toString());
        }catch (EmptyStackException e){
            System.out.println("Пустой стек!");
        }
    }
}
