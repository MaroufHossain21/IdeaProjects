public class JavaString {

    public static void main(String[] args) {

        String str1 = "Hey";
        // String Literal - String Constant Pool

        String str2 = new String("Hi, there");
        // String Object - Heap

        String str3 = "Hey";

        String str4 = new String("Hi, there");

        String str5 = "     A lot of space          ";
        String str6 = "Hey";


        System.out.println(" Oh ok " + str1);


        String str = "This is the String Test";
        System.out.println("Length of the String is: " + str.length());
        System.out.println(" Character at index 6 is : " + str.charAt(6));
        System.out.println(str.concat("This is the second String, Duh ;)"));
        System.out.println("Contains Check 1: " + str.contains("the"));
        System.out.println("Contains Check 2: " + str.contains("teh"));
        System.out.println("Start With Check: " + str.startsWith("This"));
        System.out.println("Ends With Check: " + str.endsWith("Test"));
        System.out.println(" String = String " + str1.equals(str3));

        System.out.println("Index of 't' is: " + str2.indexOf('t'));
        System.out.println("Check if String is empty: " + str.isEmpty());
        System.out.println("Trim the leading trailling spaces: " + str5.trim());

        System.out.println(str6.replace("y", "n"));
        System.out.println("SubsString Example 1: " + str.substring(4));
        System.out.println("SubsString Example 2: " + str.substring(4, 12));

        char[] charArray = str.toCharArray();
        for (int i = 2; i < charArray.length; i++) {
            System.out.println("Index" + i + " is :" + charArray[i]);

        }

            System.out.println("lowe case: " + str.toLowerCase());
            System.out.println("UPPER CASE: "+ str.toUpperCase());



    }
}
