public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello, world!";

        String concatenated = str + " How are you?";
        System.out.println("Concatenated string: " + concatenated);


        int length = str.length();
        System.out.println("Length of the string: " + length);


        String substring = str.substring(7); 
        System.out.println("Substring: " + substring);


        char firstChar = str.charAt(0); 
        System.out.println("First character: " + firstChar);

        
        String anotherStr = "Hello, world!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Strings are equal: " + isEqual);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        String replaced = str.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replaced);

        String withWhitespace = "   Trim me   ";
        String trimmed = withWhitespace.trim();
        System.out.println("Trimmed string: " + trimmed);


        String sentence = "I love Java programming";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}