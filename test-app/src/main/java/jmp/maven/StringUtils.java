package jmp.maven;

/**
 * Utility class for working with strings.
 */
public class StringUtils {

    /**
     * Method for concatenation 2 strings.
     * 
     * @param str1
     *            first string for concatenation
     * @param str2
     *            second string for concatenation
     * @return concatenation string
     */
    public static String concat(String str1, String str2) {

        if (str1!=null) {
            return str1 + str2;
        }

        try {
            return str1 + str2;
        } catch (Exception e) {

        }
        return null;
    }
}
