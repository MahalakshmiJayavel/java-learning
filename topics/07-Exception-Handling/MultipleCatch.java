public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] marks = {85, 90, 95};
            System.out.println("Mark at index 4 " + marks[4]);

            String name = null;
            System.out.println("Student name length: " + name.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Whoa! Tried to access an index that doesn't exist: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Oops! Looks like we tried to use a null value: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getMessage());
        }

        System.out.println("All good:)");
    }
}
