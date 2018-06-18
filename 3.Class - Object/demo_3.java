class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}

class Undergraduate extends Student {
    private String degree;
    public Undergraduate(String name, int age, String degree){
        super(name, age);
        this.degree = degree;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" degree: "+degree);
    }

}

public class demo_3 {

    public static void main(String[] args){

        Student stu = new Student("张三",20);
        stu.show();
        Undergraduate ug = new Undergraduate("李四", 18, "本科");
        ug.show();

    }
}

