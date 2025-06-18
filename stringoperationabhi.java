public class stringoperationabhi {

    // Method 1: Mirror Image using StringBuilder
    public static String getMirrorImage(String input) {
        final String methodName = "getMirrorImage";
        System.out.println("Method invoked: " + methodName + ": " + input);

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String mirrorImage = input.concat(" || ").concat(sb.toString());

        System.out.println("Method response: " + methodName + ": " + mirrorImage);
        return mirrorImage;
    }

    // Method 2: Mirror manually using loop (brute force)
    public static void getMirror(String str) {
        if (str.isEmpty()) {
            throw new NullPointerException("Input string is empty!");
        }

        String s = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char c = str.charAt(i);
            s += c;
        }

        System.out.println("Reversed: " + s);
    }

    // Method 3: StringBuilder operations
    public static void stringBuilderExample(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Builder");
        sb.insert(0, "Using ");
        sb.replace(6, 13, "StringBuilder");
        sb.reverse();

        System.out.println("StringBuilder Result: " + sb.toString());
    }

    // Method 4: StringBuffer operations
    public static void stringBufferExample(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.append(" Buffer");
        sb.delete(0, 2); // deletes characters from index 0 to 1
        sb.reverse();

        System.out.println("StringBuffer Result: " + sb.toString());
    }

    // Method 5: Sum all digits from an array of strings
    public static int sumDigitsFromArray(String[] strings) {
        int totalSum = 0;

        for (String str : strings) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    totalSum += Character.getNumericValue(ch);
                }
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {

        // Method calls
        String input = "hey";
        getMirrorImage(input);
        getMirror(input);
        stringBuilderExample(input);
        stringBufferExample(input);

        // Sum of digits example
        String[] fruits = { "apple23", "banana45", "vankai67", "pineapple89" };
        int result = sumDigitsFromArray(fruits);
        System.out.println("Total sum of all digits = " + result);

        // String examples
        String str = "hello";
        System.out.println("Size: " + str.length());
        System.out.println("isEmpty: " + str.isEmpty());
        System.out.println("Content: " + str.toString());

        // String objects using constructors
        String strC1 = new String("Hello");
        System.out.println("Size: " + strC1.length());
        System.out.println("isEmpty: " + strC1.isEmpty());
        System.out.println("Content: " + strC1.toString());

        String strC2 = new String("Hello");
        System.out.println("Size: " + strC2.length());
        System.out.println("isEmpty: " + strC2.isEmpty());
        System.out.println("Content: " + strC2.toString());

        // Create String from char array
        char[] ch = { 'J', 'a', 'v', 'a', 'A', 'p', 'p' };
        String strC3 = new String(ch);
        System.out.println("From char array: " + strC3);

        // Create String from a portion of char array
        String strC4 = new String(ch, 4, 3); // from index 4, 3 chars
        System.out.println("Partial from char array: " + strC4);

        // StringBuilder reverse
        StringBuilder sb = new StringBuilder("Sza");
        System.out.println("Original SB: " + sb);
        System.out.println("Reversed: " + sb.reverse());
        System.out.println("Back to original: " + sb.reverse());
        System.out.println("String from SB: " + new String(sb));

        // StringBuffer
        StringBuffer sb1 = new StringBuffer("anasuri");
        System.out.println("String from SB: " + new String(sb1));

        // String comparison
        String s = "Mru";
        String s1 = new String("Mru");
        String s2 = "Mru";
        // String s21 = new String("Mru");

        // Using ==
        System.out.println("s == s1: " + (s == s1 ? "Same" : "Not Same"));
        System.out.println("s == s2: " + (s == s2 ? "Same" : "Not Same"));

        // String methods
        String st = "Saiteja";
        System.out.println("Length: " + st.length());
        System.out.println("Char at 5: " + st.charAt(5));
        System.out.println("isBlank: " + st.isBlank());
        System.out.println("isEmpty: " + st.isEmpty());

        String st1 = st.trim();
        System.out.println("Lower: " + st1.toLowerCase());
        System.out.println("Upper: " + st1.toUpperCase());
    }
}
