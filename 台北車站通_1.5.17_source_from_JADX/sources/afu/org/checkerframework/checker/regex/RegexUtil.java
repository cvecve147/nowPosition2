package afu.org.checkerframework.checker.regex;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexUtil {

    public static class CheckedPatternSyntaxException extends Exception {

        /* renamed from: a */
        private final PatternSyntaxException f89a;

        public CheckedPatternSyntaxException(String str, String str2, int i) {
            this(new PatternSyntaxException(str, str2, i));
        }

        public CheckedPatternSyntaxException(PatternSyntaxException patternSyntaxException) {
            this.f89a = patternSyntaxException;
        }

        public String getDescription() {
            return this.f89a.getDescription();
        }

        public int getIndex() {
            return this.f89a.getIndex();
        }

        public String getMessage() {
            return this.f89a.getMessage();
        }

        public String getPattern() {
            return this.f89a.getPattern();
        }
    }

    private RegexUtil() {
        throw new AssertionError("Class RegexUtil shouldn't be instantiated");
    }

    /* renamed from: a */
    private static int m59a(Pattern pattern) {
        return pattern.matcher("").groupCount();
    }

    /* renamed from: a */
    private static String m60a(String str, int i, int i2) {
        return "regex \"" + str + "\" has " + i2 + " groups, but " + i + " groups are needed.";
    }

    public static String asRegex(String str) {
        asRegex(str, 0);
        return str;
    }

    public static String asRegex(String str, int i) {
        try {
            int a = m59a(Pattern.compile(str));
            if (a >= i) {
                return str;
            }
            throw new Error(m60a(str, i, a));
        } catch (PatternSyntaxException e) {
            throw new Error(e);
        }
    }

    public static boolean isRegex(char c) {
        return isRegex(Character.toString(c));
    }

    public static boolean isRegex(String str) {
        return isRegex(str, 0);
    }

    public static boolean isRegex(String str, int i) {
        try {
            return m59a(Pattern.compile(str)) >= i;
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String regexError(String str) {
        return regexError(str, 0);
    }

    public static String regexError(String str, int i) {
        try {
            int a = m59a(Pattern.compile(str));
            if (a < i) {
                return m60a(str, i, a);
            }
            return null;
        } catch (PatternSyntaxException e) {
            return e.getMessage();
        }
    }

    public static PatternSyntaxException regexException(String str) {
        return regexException(str, 0);
    }

    public static PatternSyntaxException regexException(String str, int i) {
        try {
            int a = m59a(Pattern.compile(str));
            if (a < i) {
                return new PatternSyntaxException(m60a(str, i, a), str, -1);
            }
            return null;
        } catch (PatternSyntaxException e) {
            return e;
        }
    }
}
