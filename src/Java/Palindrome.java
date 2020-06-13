package Java;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("madam");
    }

    public static void isPalindrome(String str){
        boolean isPalindrome = true;
            for (int i = 0; i <=str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrome=false;
            }
        }
        System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
    }

}
