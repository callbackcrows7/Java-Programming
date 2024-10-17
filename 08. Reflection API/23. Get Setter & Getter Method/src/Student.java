public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
    }

    public int getAge() {
        return age;
    }

    public void sayHi(String message) {
        System.out.println(message);
    }
}
