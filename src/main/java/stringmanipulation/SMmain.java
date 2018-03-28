package stringmanipulation;

public class SMmain {
    public static void main(String[] args) {
        String usernameInDatabase = "modernNerd";
        String passwordInDatabase = "mN123Java";

        String providedUsername = "modernnerd";
        String providedPassword = "mN123Java";

        if (providedUsername.equalsIgnoreCase(usernameInDatabase)) {
            //successful username comparison
            //check the provided password

            //this will fail
            //if("mn123java".equals(passwordInDatabase)){}

            //this will pass
            if (providedPassword.equals(passwordInDatabase)) {
                System.out.println("Success! You are logged in.");
            } else {
                System.out.println("Wrong password. Try again.");
            }
        } else {
            //user provided wrong username
            System.out.println("Wrong username. Try again.");
        }

        String message = "Hello, world! My name is Lincoln";
        int messageLength = message.length();
        if(messageLength >= 140) {
            System.out.println("out");
        }else {
            System.out.println("Not ");
        }
    }
}
