public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i =0;i<sentences.length;i++){
            for (int j =0;j<keywords.length;j++){
                if (contains(sentences[i], keywords[j])) {
                    System.out.println(sentences[i]);
                }
            }
        }
    }
    //recycling code is ecologic
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
