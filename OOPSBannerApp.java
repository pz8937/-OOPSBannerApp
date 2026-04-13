public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " ***  ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*     "),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*     "),
            String.join(" ", "*   * ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*   * ", " *     ", "     * ", "     * "),
            String.join(" ", "*   * ", " *     ", "     * ", "     * "),
            String.join(" ", " ***  ", " ***** ", " ***** ", " ***** ")
        };

        // Print each line using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}