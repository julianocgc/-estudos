public class Main {

    public static void main(String[] args) {
        User userA = new User();
        userA.setFirstName("tiago aguiar");;

        User userB = new User();
        userB.setFirstName("Apple Incorporation");;

        System.out.println(userA.getFirstName());
        System.out.println(userB.getFirstName());
    }
}