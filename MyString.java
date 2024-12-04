public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        //NEW
        System.out.println("NEW TESTS NOW:");
        System.out.println(MyString.contains("baba yaga", "baba")); // true
        System.out.println(MyString.contains("baba yaga", "")); // true
        System.out.println(!MyString.contains("baba yaga", "John Wick is the baba yaga")); // true
        System.out.println(!MyString.contains("baba yaga", "Yaga")); // true
        System.out.println(!MyString.contains("baba yaga", "babayaga")); // true
        //END NEW
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String str2="";
        int diff = 'A'-'a';
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>64&&str.charAt(i)<91)
                str2 += (char)(str.charAt(i)-diff);
            else
                str2 += str.charAt(i);
        }
        return str2;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
public static boolean contains(String str1, String str2) {
    // Edge cases
    if (str2.length() > str1.length()) {
        return false; // str2 cannot be contained in a shorter str1
    }
    if (str2.length() == 0) { // Check for empty string 
        return true; // Empty string is contained in everything
    }

    // Main logic
    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        boolean match = true; // Assume a match
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                match = false; // Mismatch found
                break; // Exit inner loop early
            }
        }
        if (match) {
            return true; // Match found
        }
    }

    return false; // No match found
}

}
