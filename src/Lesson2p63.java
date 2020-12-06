public class Lesson2p26q {
    public static void main(String[] args) {
        Employee1 e=new Employee1();
        System.out.println(e.company);
    }
}
//названия классов изменены во избежании ошибки дублирования
// изменить название классов перед тестированием
class Person1{
    public String name;
    public int age;
}
class Employee1 extends Person1{
    public String company;
    public void work(){};
    public void relax(){};
}

abstract class Animal{
    public abstract String eat();
}
class Dog extends Animal{

    @Override
    public String eat() {
        return "Bone";
    }
}

interface Drawable{
    public void draw();
}
class MyClass implements Drawable{
    public boolean drawing;

    public void start(){};
    public void stop(){};
    @Override
    public void draw(){};
}

//final