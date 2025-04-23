public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
            new User("Tiago", "Aguiar"),
            new User("João", "Silva"),
            new User("Flávia", "Colombo")
        };

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}