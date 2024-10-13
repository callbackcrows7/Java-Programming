public class ReflectDemo {
    public static void main(String[] args) {
        /* 
         * Usages: forName() method is used to load the class dynamically.
         * Returns type: The method returns a Class object that contains the information about the specified class.
         * forName() method should be used if you know the fully qualified name of class.
         * This method cannot be used for primitive types.
         */
         try {
             Class<?> classObject = Class.forName("Department.Student");
             System.out.println("Class Name: " + classObject.getName());
             System.out.println("Simple Name: " + classObject.getSimpleName());
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
 
    }
}
