public class Ex11 {

    public boolean isLegal(String word) {

        if (!word.matches("[abc]+")) {
            return false;
        }

        if (word.charAt(0) != 'a') {
            return false;
        }

        int countB = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'b') {
                countB++;
            }
        }
        if (countB % 2 != 0) {
            return false;
        }

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == 'c' && word.charAt(i + 1) != 'a' || word.charAt(i + 2) != 'a') {
                return false;
            }
        }

        return true;
    }
}
