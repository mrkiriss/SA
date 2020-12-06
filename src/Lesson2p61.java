import java.util.Objects;

public class Lesson2p61 {
    public static void main(String[] args) {
        Person p = new Person("Test", 3);
        System.out.println(p);
        p.setAge(5);
        p.setName("Vasya");
        System.out.println(p);
        System.out.println(p.work());
        Employee e = new Employee("1", 2, "3");
        System.out.println(e);
        System.out.println(e.work());
    }
}

class Person{
    int age;
    String name;

    Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    String work(){
        return "None";
    }
    public String toString(){
        return ("("+String.valueOf(name)+", "+String.valueOf(age)+")");
    }
}

class Employee extends Person{
    String company;
    Employee(String name, int age, String company) {
        super(name, age);
        this.company=company;

    }
    @Override
    public String toString(){
        return ("("+String.valueOf(name)+", "+String.valueOf(age)+", "+String.valueOf(company)+")");
    }
    @Override
    String work(){
        return "Manager";
    }
}