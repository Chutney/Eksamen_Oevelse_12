public class Main {

    public static void main(String[] args) {

        User user = new User("Noah Van Wagenen");

        user.setUserID("novas750");

        System.out.println(user.validUserID());

        user.createUserID();



        System.out.println(user.getUserID());


    }

}
