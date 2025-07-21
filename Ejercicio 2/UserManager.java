public class UserManager {
    public void addUser(String name, String email) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        if (email == null || email.isEmpty()) {
            System.out.println("Invalid email");
            return;
        }
        System.out.println("User added: " + name + " - " + email);
    }

    public void updateUser(String name, String email) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        if (email == null || email.isEmpty()) {
            System.out.println("Invalid email");
            return;
        }
        System.out.println("User updated: " + name + " - " + email);
    }
}