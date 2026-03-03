public class BannerUC6 {

    // Static method for letter O
    public static String[] printO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] printP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] printS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = printO();
        String[] p = printP();
        String[] s = printS();

        // Print OOPS
        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}