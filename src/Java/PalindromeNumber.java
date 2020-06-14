package Java;
//Create a method that will accept a method (long) and determine if the number of palindrome or not.
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12321));
    }

    public static boolean isPalindromeNumber(long num){
        long remain = num;
        long rev = 0;

        while(remain!=0){
            long digit = remain%10;
            rev = rev*10+digit; //0*10 >> 0+1
            remain = remain/10;
        }
        return rev==num;
    }
}
