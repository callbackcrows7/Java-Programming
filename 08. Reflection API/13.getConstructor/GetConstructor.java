import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class GetConstructor {
    public static void main(String[] args) {
        try {
            // ArrayList ক্লাসের মেটাডেটা অবজেক্ট তৈরি করা হচ্ছে
            Class<ArrayList> classObject = ArrayList.class;

            // কন্সট্রাক্টরগুলোর তালিকা নেওয়া হচ্ছে
            Constructor<?>[] constructorsArray = classObject.getConstructors();

            // যদি কোনো কন্সট্রাক্টর না থাকে
            if (constructorsArray.length == 0) {
                System.out.println("No constructors available for ArrayList.");
            } else {
                System.out.println("Constructors of ArrayList:\n");

                // সব কন্সট্রাক্টরের নাম প্রিন্ট করা হচ্ছে
                for (Constructor<?> constructor : constructorsArray) {
                    System.out.println("- " + constructor);
                    System.out.println("- Name: " + constructor.getName());
                    System.out.println("- Parameter types: " + constructor.getParameterTypes());
                    System.out.println("- Parameter count: " + constructor.getParameterCount());
                    System.out.println("---------------------------------------------------");
                }
            }
        } catch (Exception e) {
            // এক্সেপশন ঘটলে মেসেজ প্রিন্ট করা হবে
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
