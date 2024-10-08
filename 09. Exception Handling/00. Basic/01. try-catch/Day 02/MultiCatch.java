public class MultiCatch {
   public static void main(String[] args) {
        try {
            int [] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
            System.out.println(10 / 0); // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Invalid Operation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Common Error: " + e.getMessage());
        }
   } 
}
