public class UserProfile {
    private String name;
    private String email;

    // Constructor
    public UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmailDomain() {
        return email.split("@")[1]; // if email is null show NullPointerException.
    }
}
