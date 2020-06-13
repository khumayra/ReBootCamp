package Java;

public class Anagrams {
    public static void main(String[] args) {
        isAnagram("listen", "silent");
    }

    public static void isAnagram(String str1, String str2) {
        boolean isAnagram = false;
        String check = "";
        str1 = str1.toLowerCase().replace(" ", ""); //make sure that it both strings have the same format
        str2 = str2.toLowerCase().replace(" ", "");

        if (str1.length() != str2.length()) {  //check length to make sure that they are equal
            System.out.println("Not Anagram");
            System.exit(0);
        }

        for (int i = 0; i < str1.length(); i++) {
            char curCharStr1 = str1.charAt(i);
            str2 = str2.replace(curCharStr1 + "", "");
        }
        if(str2.equals("")) System.out.println("It's Anagram");
    }

}
