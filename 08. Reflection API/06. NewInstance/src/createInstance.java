import Instance.DisplayMessage;

public class createInstance {
    public static void main(String[] args) {
        try {
            Class<?> classObject = Class.forName("DisplayMessage");

            DisplayMessage displayMessage = (DisplayMessage)classObject.newInstance();
            displayMessage.sayHello();
            
        }catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
