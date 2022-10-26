package Lesson3.CatStack;

public class Cat {
    public String name;
    public int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
