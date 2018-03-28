package java8;

public class Constructorreference {
    public static void main(String[] args) {
        Message message = String::new;

        char[] charArray = {'K','i','m'};
        System.out.println(message.displayMessage(charArray));
    }
}
interface Message{
    String displayMessage(char[] chArray);
}
