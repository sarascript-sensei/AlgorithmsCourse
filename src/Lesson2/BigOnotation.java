package Lesson2;

import java.util.Random;

public class BigOnotation {
    //O(n)
    //4-8-15-16-23-45
    //Big O Notation


    public static void print_num(int [] arr){
        for (int i : arr){
            System.out.println(i);// O(8) -> O(n)
        }
    }

    public static void print_pairs(int [] arr){
        for(int i : arr){
            for(int j : arr){
                System.out.println(i + "+" + j); //O(64) -> O(n^2)
            }
        }
    }

    public static void getSuit(){
        String [] suit = {"Классика", "Спортивный", "Вечерний"};
        int randomSuit = new Random().nextInt(suit.length);
        System.out.println(suit[randomSuit]); //O(1)
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        print_num(arr);
        print_pairs(arr);
        getSuit();
    }


}
