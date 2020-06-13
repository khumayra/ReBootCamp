package Java;
//Create a method that will accept a number and check if the number is an Armstrong number.
// If the number is Armstrong number return true otherwise false

//Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(21));
        System.out.println(isArmstrong2(153));
    }
    public static boolean isArmstrong(int num) {
        //153 > 1^3+5^3+3^3
        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit, power);
        }
        return sum==num;
    }
    public static boolean isArmstrong2(int num){
        int digits = num;
        int sum =0;
        int power = String.valueOf(num).length();

        while(digits!=0){
            int each = digits%10;
            digits/=10;
            sum+=Math.pow(each, power);

        }
        return sum==num;
    }
}
