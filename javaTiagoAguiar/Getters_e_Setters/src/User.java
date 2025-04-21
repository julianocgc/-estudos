public class User {

    // PROPRIEDADES (PRIVATE)
    private String firstName;
    private String lastName;

    // SETTER = ACESSAR PROPRIEDADES PRIVADAS
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setlastName(String firstName) {
        this.lastName = lastName.toUpperCase();
    }

    // GETTER = ACESSAR PROPRIEDADES PRIVADAS
    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }
}
