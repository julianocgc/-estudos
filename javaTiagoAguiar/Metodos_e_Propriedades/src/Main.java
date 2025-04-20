public class Main {
    public static void main(String[] args) {
        User userA = new User();
        userA.firstName = "Tiago";
        userA.lastName = "Aguiar";
        String fullName = userA.getFullName();

        System.out.println(fullName);
    }
}