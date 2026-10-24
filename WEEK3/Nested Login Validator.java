public class NestedLoginValidator {
    public static void main(String[] args) {
        String username = "Hxnygrc";
        String password = "honeybee08";
        boolean accountUnlocked = true;

        if (username.equals("Hxnygrc")) {
            if (password.equals("honeybee08")) {
                if (accountUnlocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }
    }
}
