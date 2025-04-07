public class NewStringMethods {
    public static void main(String[] args) {

        String paragraph = "This is line one\nThis is line two\nAnd this is line three";
        System.out.println("Printing each line from the paragraph:");
        paragraph.lines().forEach(line -> System.out.println("- " + line));

        String messageWithSpaces = "   Hey there, Maha!   \n";
        System.out.println("\nOriginal message: '" + messageWithSpaces + "'");
        System.out.println("After using strip(): '" + messageWithSpaces.strip() + "'");

        String cheer = "Go Maha! ";
        System.out.println("\nRepeating the cheer 3 times:");
        System.out.println(cheer.repeat(3));
    }
}

