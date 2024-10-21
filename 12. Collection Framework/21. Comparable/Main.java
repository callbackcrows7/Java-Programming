import java.util.*; 
  
class Student implements Comparable<Student> { 
    String name; 
    int marks; 
  
    public Student(String name, int marks) { 
        this.name = name; 
        this.marks = marks; 
    } 
  
    public int compareTo(Student other) { 
        return this.marks - other.marks; 
    } 
  
    public String toString() { 
        return this.name + ": " + this.marks; 
    } 
} 
  
public class Main { 
    public static void main(String[] args) { 
        List<Student> students = new ArrayList<>(); 
        students.add(new Student("Alice", 85)); 
        students.add(new Student("Bob", 75)); 
        students.add(new Student("Charlie", 95)); 
  
        Collections.sort(students); 
  
        System.out.println(students);  // Output: [Bob: 75, Alice: 85, Charlie: 95] 
    } 
} 