public class Main {
    public static void main(String[] args) {
        int x = 0;
        User userA = new User();
        userA.firstName = "Tiago";
        userA.lastName = "Aguiar";

        User userB = new User();
        userB.firstName = "João";
        userB.lastName = "Silva";

        System.out.println(userA.firstName);
        System.out.println(userB.firstName);
    }
}