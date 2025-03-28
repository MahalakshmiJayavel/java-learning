import java.util.Optional;  // Necessary import for Optional

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(getNullableString());

        String result = optionalString.orElse("Default String");//IF THE OPTIONAL STRING IS NULL THEN THE DEFAULT STRING WILL BE OBTAINED
        System.out.println("Using orElse: " + result);
    }

    public static String getNullableString() {
        return Math.random() > 1 ? "Hello, World!" : null;
    }
}
