package Round2;

public class NearestVowel {
    public static void main(String[] args) {
        String input = "PhonE";
        String output = replaceConsonantsWithNearestVowel(input);
        System.out.println(output); 
    }

    private static String replaceConsonantsWithNearestVowel(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char replacedChar = ch;
            if (isConsonant(ch)) {
                char nearestVowel = findNearestVowel(ch);
                if (Character.isUpperCase(ch)) {
                    replacedChar = Character.toUpperCase(nearestVowel);
                } else {
                    replacedChar = Character.toLowerCase(nearestVowel);
                }
            }
            result.append(replacedChar);
        }
        return result.toString();
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toUpperCase(ch);
        return ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }

    private static char findNearestVowel(char ch) {
        ch = Character.toUpperCase(ch);
        char nearestVowel = ch;
        switch (ch) {
            case 'B': case 'C': 
                nearestVowel = 'A';
                break;
            case 'D': case 'F': case 'G': 
                nearestVowel = 'E';
                break;
            case 'J': case 'K': case 'L': case 'H':
                nearestVowel = 'I';
                break;
            case 'M': case 'N': case 'P': case 'Q': case 'R': 
                nearestVowel = 'O';
                break;
            case 'S': case 'T':
                nearestVowel = 'U';
                break;
            case 'V': case 'W': case 'X': case 'Y': case 'Z':
                nearestVowel = 'U';
                break;
        }
        return nearestVowel;
    }
}
