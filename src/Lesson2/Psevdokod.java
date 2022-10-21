package Lesson2;

import java.util.Scanner;

public class Psevdokod {

    /*
    START
    PROGRAM getColor
    CREATE variable Color
    Ask the user for their favorite color
    READ INPUT into Color
    PRINT Color
    END
     */

    public void getColor(){
        String color;
        System.out.println("What is your favorite color? ");
        Scanner sc = new Scanner(System.in);
        color = sc.nextLine();
        System.out.println("Your favorite color: " + color);
    }

}
