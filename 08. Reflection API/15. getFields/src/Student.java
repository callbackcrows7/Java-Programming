public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    } 
    
    public void setAge(int age) {
        this.age = age;
    } 
    public int getAge() {
        return age;
    }

    public void seyHi() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
