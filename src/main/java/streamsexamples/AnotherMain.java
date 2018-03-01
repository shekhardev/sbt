package streamsexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnotherMain {
    public static void main(String[] args) {
        List<User> users= Arrays.asList(
                new User("Peter",16,Arrays.asList("1","2")),
                new User("Tom",17,Arrays.asList("5")),
                new User("Chris",20,Arrays.asList("4","6")));

        Optional<String> stringOptional =users.stream()
                .map(user-> user.getPhoneNumbers().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo->phoneNo.equals("10")))
                .findAny();
        stringOptional.ifPresent(System.out::println);
    }
}
