public class Ex10 {

    public char charAt(int index) {
        if (index < 0 || index >= this.length()) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return this.value[index];
    }

    public int indexOf(char c) {
        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public int howManySpecial(String s, char start, char end) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == start) {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) != end) {
                    j++;
                }
                if (j < s.length()) {
                    count++;
                }
                i = j;
            } else {
                i++;
            }
        }
        return count;
    }
}