public class User {

    public String firstName;
    public String lastName;
    public String fullName;
    public Address address;

    public String getFullName() {
    return firstName + " " + lastName;
    }
}
