package String;

class rotationInString {
//KMP alogo
    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                // AACDAACD
                ((str1 + str1).contains(str2));
    }

    public static void main(String[] args) {
        String str1 = "myString";
        String str2 = "Stringmy";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
