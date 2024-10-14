import java.util.ArrayList;

public class GetInterfaces {
    public static void main(String[] args) {
        try {
            // ArrayList ক্লাসের মেটাডেটা অবজেক্ট তৈরি করা হচ্ছে
            Class<ArrayList> classObject = ArrayList.class;
            
            // ইন্টারফেসগুলোর তথ্য সংগ্রহ করা হচ্ছে
            Class<?>[] classArray = classObject.getInterfaces();
            
            // যদি কোনো ইন্টারফেস পাওয়া না যায়, সে ক্ষেত্রে মেসেজ দেখানো হবে
            if (classArray.length == 0) {
                System.out.println("No interfaces implemented by ArrayList.");
            } else {
                System.out.println("Interfaces implemented by ArrayList:");
                // প্রতিটি ইন্টারফেসের নাম প্রিন্ট করা হচ্ছে
                for (Class<?> class1 : classArray) {
                    System.out.println("- " + class1.getName());
                }
            }
        } catch (Exception e) {
            // যদি কোনো এক্সেপশন ঘটে, তা ক্যাপচার করে মেসেজ দেখানো হবে
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
