public class Leetcode65 {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean numberSeen = false;
        boolean numberAftere = true;
        boolean eSeen = false;
        boolean dotSeen = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAftere = true;
            } else if (s.charAt(i) == '.') {
                if (dotSeen || eSeen)
                    return false;
                dotSeen = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (eSeen || !numberSeen)
                    return false;
                numberAftere = false;
                eSeen = true;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e')
                    return false;
            } else {
                return false;
            }
        }
        return numberSeen && numberAftere;
    }

}