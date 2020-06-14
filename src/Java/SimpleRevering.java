package Java;

public class SimpleRevering {
    public static void main(String[] args) {
        String word ="Hello";
        System.out.println(reverseStr(word));
    }

    public static String reverseStr(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
           reverse=reverse+str.charAt(i);
        }
         return reverse;
    }
}
