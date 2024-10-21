import java.util.*; 
  
class Student { 
    String name; 
    int marks; 
  
    public Student(String name, int marks) { 
        this.name = name; 
        this.marks = marks; 
    } 
  
    public String toString() { 
        return this.name + ": " + this.marks; 
    } 
} 
  
class NameComparator implements Comparator<Student> { 
    public int compare(Student s1, Student s2) { 
        return s1.name.compareTo(s2.name); 
    } 
} 
  
public class Main { 
    public static void main(String[] args) { 
        List<Student> students = new ArrayList<>(); 
        students.add(new Student("Alice", 85)); 
        students.add(new Student("Bob", 75)); 
        students.add(new Student("Charlie", 95)); 
  
        Collections.sort(students, new NameComparator()); 
  
        System.out.println(students);  // Output: [Alice: 85, Bob: 75, Charlie: 95] 
    } 
} 