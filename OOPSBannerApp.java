import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static method to build the character pattern map
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Static method to render the banner
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    sb.append(pattern[row]).append("  ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}