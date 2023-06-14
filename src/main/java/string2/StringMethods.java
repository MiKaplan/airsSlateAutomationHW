package string2;

import java.util.Locale;

public class StringMethods {

    public String doubleChar(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stringBuilder.append(c).append(c);
        }
        return stringBuilder.toString();
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

    public boolean bobThere(String str) {
        boolean isTrue = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                isTrue = true;
                break;
            }
        }

        return isTrue;
    }

    public String repeatEnd(String str, int n) {

        return str.substring(str.length() - n).repeat(n);
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1)){
                return true;
            }
        }

        return false;
    }

    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str);

        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == '*' && result.charAt(i + 1) == '*'){
                result.deleteCharAt(i);
            }
            if (result.charAt(i) == '*' && result.charAt(i + 1) != '*') {
                result.delete(i - 1, i + 2);
            }
        }

        return result.toString();
    }

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }

        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public boolean xyBalance(String str) {
        int lastYIndex = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                lastYIndex = str.indexOf('y', i);
                if (lastYIndex == -1) {
                    return false;
                }
            }
        }

        return true;
    }

    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }

        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2).equals("xyz");
        }

        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2).equals("xyz")
                    || str.substring(str.length() / 2, str.length() / 2 + 3).equals("xyz");

    }

    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i += 3) {
            result.append(str.substring(i + 1, i + 3));
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - wordLength && str.substring(i, i + wordLength).equals(word)) {
                result.append(word);
                i += wordLength;
            } else {
                result.append("+");
                i++;
            }
        }

        return result.toString();
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i+3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i+3).equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);

            if (i < count - 1) {
                result.append(sep);
            }
        }

        return result.toString();
    }

    public String getSandwich(String str) {
        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");

        if (firstBreadIndex != -1 && lastBreadIndex != -1 && firstBreadIndex != lastBreadIndex) {
            return str.substring(firstBreadIndex + 5, lastBreadIndex);
        }

        return "";
    }

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i < length - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        int strLength = str.length();

        for (int i = 0; i < strLength - wordLength + 1; i++) {
            if (str.substring(i, i + wordLength).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + wordLength < strLength) {
                    result.append(str.charAt(i + wordLength));
                }
            }
        }

        return result.toString();
    }


}
