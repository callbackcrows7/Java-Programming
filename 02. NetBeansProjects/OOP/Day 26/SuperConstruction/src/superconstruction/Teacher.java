
package superconstruction;

/**
 *
 * @author CBC7
 */
public class Teacher extends Student {
   private String qualification;
   
   Teacher(String name, int age, String gender, String qualification) {
       super(name, age, gender);
       this.qualification = qualification;
   }
   
   public String getQualification() {
       return qualification;
   }
   
   @Override
   public void displayInfo() {
       super.displayInfo();
       System.out.println("Qulafication: "+getQualification());
   }
}
