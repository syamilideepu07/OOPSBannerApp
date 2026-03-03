public class BannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization using String.join()
        String[] banner = {
                String.join("", "***************"),
                String.join("", "*             *"),
                String.join("", "*   OOPS APP   *"),
                String.join("", "*   UC5 DEMO   *"),
                String.join("", "*             *"),
                String.join("", "*   Welcome!   *"),
                String.join("", "***************")
        };

        // Enhanced for-loop to display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}